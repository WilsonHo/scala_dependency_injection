package michaelpnash.guice.instance

import com.google.inject.{AbstractModule, Guice}
import michaelpnash.guice.AService
import michaelpnash.guice.Utils._

/**
  * Created by wilson on 3/29/17.
  */
object InstanceBindingExample extends App {

    // if you want to bind to a specific instance of a class...
    class InstanceExampleModule1 extends AbstractModule {
      @Override
      protected def configure() {
        val instance1 = new InstanceService1("instance1")
        bind(classOf[AService]).toInstance(instance1)
      }
    }

  class InstanceExampleModule2 extends AbstractModule {
    @Override
    protected def configure() {
      val instance1 = new InstanceService1("instance2")
      bind(classOf[AService]).toInstance(instance1)
    }
  }
    val injector1 = Guice.createInjector(new InstanceExampleModule1)
    val service1: MyComponent = injector1.getInstance(classOf[MyComponent])
    assertEquals("instance1", service1.callTheService())

  val injector2 = Guice.createInjector(new InstanceExampleModule2)
  val service2: MyComponent = injector2.getInstance(classOf[MyComponent])
  assertEquals("instance2", service2.callTheService())
}
