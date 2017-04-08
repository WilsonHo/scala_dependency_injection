package wilson.guice.redis_connection.module

import com.google.inject.AbstractModule
//import wilson.guice.redis_connection.component.{IComponent, RunningComponent}
import wilson.guice.redis_connection.Service.{CacheService, RedisEmbeddedService}

/**
  * Created by wilson on 4/7/17.
  */
class RedisEmbeddedModule extends AbstractModule {
  @Override
  protected def configure() {
    bind(classOf[CacheService]).toInstance(RedisEmbeddedService("localhost", 6379))

    //TODO: EXAMPLE 1
    //    bind(classOf[IComponent]).toInstance(RunningComponent)
  }
}