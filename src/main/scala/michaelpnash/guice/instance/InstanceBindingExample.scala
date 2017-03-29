package michaelpnash.guice.instance

import com.google.inject.{AbstractModule, Guice}
import michaelpnash.guice.AService
import michaelpnash.guice.Utils._

/**
  * Created by wilson on 3/29/17.
  */
object InstanceBindingExample extends App {

    // if you want to bind to a specific instance of a class...
    class InstanceExampleModule extends AbstractModule {
      @Override
      protected def configure() {
        val instance1 = new InstanceService("instance1")
        bind(classOf[AService]).toInstance(instance1)
      }
    }
    val injector = Guice.createInjector(new InstanceExampleModule)
    val service = injector.getInstance(classOf[AService])
    assertEquals("instance1", service.service)
}
