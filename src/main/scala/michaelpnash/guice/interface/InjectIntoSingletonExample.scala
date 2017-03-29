package michaelpnash.guice.interface

import com.google.inject.{AbstractModule, Guice}
import michaelpnash.guice.AService
import michaelpnash.guice.instance.InstanceService
import michaelpnash.guice.Utils._
/**
  * Created by wilson on 3/29/17.
  */
object InjectIntoSingletonExample extends  App{
  // if you want to inject into an object instead of a class
  class InstanceExampleModule extends AbstractModule {
    @Override
    protected def configure() {
      val instance1 = new InstanceService("instance1")
      bind(classOf[AService]).toInstance(instance1)
      bind(classOf[SingletonComponentInterface]).toInstance(SingletonComponent)
    }
  }
  val injector = Guice.createInjector(new InstanceExampleModule)
  val component = injector.getInstance(classOf[SingletonComponentInterface])
  assertEquals("instance1", component.callTheService)
}
