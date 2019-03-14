import org.yaml.snakeyaml.Yaml;
import play.*;
import javax.inject.Inject;
import javax.inject.Singleton;

import io.ebean.Ebean;
import models.Tag;

import java.util.*;

@Singleton
public class ApplicationStart {

  private final play.Environment environment;

  @Inject
  public ApplicationStart(Environment environment) {

    this.environment = environment;

    // populate our Tags table with a yaml file if we do not have any entries
    if (Ebean.find(Tag.class).findCount() == 0) {
      Yaml yaml = new Yaml();
      Map<String, List<Object>> all = (Map<String, List<Object>>) yaml.load(this.environment.resourceAsStream("initial-data.yml"));

      Ebean.saveAll(all.get("tags"));
    }
  }
}
