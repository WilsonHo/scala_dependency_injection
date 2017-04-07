package wilson.guice.redis_connection.component

import com.google.inject.Inject
import wilson.guice.redis_connection.Service.CacheService

/**
  * Created by wilson on 4/7/17.
  */
object RunningComponent extends IComponent{
  @Inject val service: CacheService = null

  def CacheSomethingPlusOne(key: String, value: String): String = {
    service.cache(key, value)
    service.getValue(key) + "1"
  }
}
