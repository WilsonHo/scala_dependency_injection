package wilson.guice.redis_connection.module

import com.google.inject.AbstractModule
import wilson.guice.redis_connection.component.{ IComponent, RunningComponent}
import wilson.guice.redis_connection.Service.{CacheService, LocalCacheService}

/**
  * Created by wilson on 4/7/17.
  */
class RedisLocalModule extends AbstractModule {
  @Override
  protected def configure() {
    bind(classOf[CacheService]).to(classOf[LocalCacheService])
    bind(classOf[IComponent]).toInstance(RunningComponent)
  }
}