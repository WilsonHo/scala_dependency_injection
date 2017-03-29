package michaelpnash.guice.singleton

import com.google.inject.{AbstractModule, Guice}
import michaelpnash.guice.AService
import michaelpnash.guice.Utils._
/**
  * Created by wilson on 3/29/17.
  */
object SingletonOrPrototype extends  App{
  class ScalaModuleSingleton extends AbstractModule {
    @Override
    protected def configure() {
      bind(classOf[AService]).toInstance(SingletonService)
    }
  }

  class ScalaModuleNonSingleton extends AbstractModule {
    @Override
    protected def configure() {
      bind(classOf[AService]).to(classOf[NonSingletonService])
    }
  }

  val singletonInjector = Guice.createInjector(new ScalaModuleSingleton)
  val singleton = singletonInjector.getInstance(classOf[AService])
  assertEquals("singleton", singleton.service)
  val secondInstance = singletonInjector.getInstance(classOf[AService])
  assertSame(singleton, secondInstance)

  val nonSingletonInjector = Guice.createInjector(new ScalaModuleNonSingleton)
  val nonsingleton = nonSingletonInjector.getInstance(classOf[AService])
  assertEquals("nonsingleton", nonsingleton.service)
  val secondNonSingletonInstance = nonSingletonInjector.getInstance(classOf[AService])

  assertNotSame(nonsingleton, secondNonSingletonInstance)


  val singletonInjector1 = Guice.createInjector(new ScalaModuleSingleton)
  val singletonClass = singletonInjector1.getInstance(classOf[AService])
  assertEquals("singleton", singletonClass.service)
  val secondInstanceClass = singletonInjector1.getInstance(classOf[AService])
  assertSame(singletonClass, secondInstanceClass)
}
