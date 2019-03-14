import com.google.inject.AbstractModule;

public class StartModule extends AbstractModule{


  protected void configure() {

    bind(EvolutionsApplier.class).asEagerSingleton();
    bind(ApplicationStart.class).asEagerSingleton();
  }
}
