package michaelpnash.guice.simplest

import com.google.inject.{AbstractModule, Guice}
import michaelpnash.guice.AService
import michaelpnash.guice.Utils._

/**
  * Created by wilson on 3/29/17.
  */
object BasicDependencyInjection extends App {


  class ScalaModule extends AbstractModule {
    @Override
    protected def configure() {
      bind(classOf[AService]).to(classOf[SomeService])
    }
  }

  class ScalaModule2 extends AbstractModule {
    @Override
    protected def configure() {
      bind(classOf[AService]).to(classOf[SomeOtherService])
    }
  }

  val injector = Guice.createInjector(new ScalaModule)
  val component = injector.getInstance(classOf[MyComponent])
  assertEquals("someService", component.callTheService)

  val injector2 = Guice.createInjector(new ScalaModule2)
  val component2 = injector2.getInstance(classOf[MyComponent])
  assertEquals("someOtherService", component2.callTheService)
}
