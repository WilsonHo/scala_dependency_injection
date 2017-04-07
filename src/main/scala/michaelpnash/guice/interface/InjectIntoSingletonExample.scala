package michaelpnash.guice.interface

import com.google.inject.{AbstractModule, Guice}
import michaelpnash.guice.AService
import michaelpnash.guice.Utils._

/**
  * Created by wilson on 3/29/17.
  */
object InjectIntoSingletonExample extends App {

  // if you want to inject into an object instead of a class
  class InstanceExampleModule1 extends AbstractModule {
    @Override
    protected def configure() {
      val instance1 = new InstanceService1("instance1")
      bind(classOf[AService]).toInstance(instance1)
      bind(classOf[SingletonComponentInterface]).toInstance(SingletonComponent)
    }
  }

  class InstanceExampleModule2 extends AbstractModule {
    @Override
    protected def configure() {
      val instance1 = new InstanceService1("instance2")
      bind(classOf[AService]).toInstance(instance1)
      bind(classOf[SingletonComponentInterface]).toInstance(SingletonComponent)
    }
  }

  val injector1 = Guice.createInjector(new InstanceExampleModule1)
  val component1: SingletonComponentInterface = injector1.getInstance(classOf[SingletonComponentInterface])
  assertEquals("instance1", component1.callTheService)

  val injector2 = Guice.createInjector(new InstanceExampleModule2)
  val component2: SingletonComponentInterface = injector2.getInstance(classOf[SingletonComponentInterface])
  assertEquals("instance2", component2.callTheService)
}
