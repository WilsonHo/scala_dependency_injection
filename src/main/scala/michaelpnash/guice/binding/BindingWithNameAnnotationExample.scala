package michaelpnash.guice.binding

import com.google.inject.{AbstractModule, Guice}
import com.google.inject.name.Names
import michaelpnash.guice.AService
import michaelpnash.guice.Utils._

/**
  * Created by wilson on 3/29/17.
  */
object BindingWithNameAnnotationExample extends App {

  // what if I have two implementations of the same interface, how do I say which one I want?
  class ScalaModule extends AbstractModule {
    @Override
    protected def configure() {
      bind(classOf[AService]).annotatedWith(Names.named("foo")).to(classOf[SomeServiceNamedFoo])
      bind(classOf[AService]).annotatedWith(Names.named("bar")).to(classOf[SomeServiceNamedBar])
    }
  }

  val injector = Guice.createInjector(new ScalaModule)
  val barComponent = injector.getInstance(classOf[MyBarComponent])
  val fooComponent = injector.getInstance(classOf[MyFooComponent])
  assertEquals("bar", barComponent.callTheService)
  assertEquals("foo", fooComponent.callTheService)
}
