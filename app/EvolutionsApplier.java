import play.db.DBApi;
import play.db.Database;
import play.db.evolutions.Evolutions;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class EvolutionsApplier {

  private final Database database;

  @Inject
  public EvolutionsApplier(DBApi dbApi) {
    this.database = dbApi.getDatabase("default");

    Evolutions.applyEvolutions(database);
  }
}
