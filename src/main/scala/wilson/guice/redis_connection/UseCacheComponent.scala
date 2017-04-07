package wilson.guice.redis_connection

import com.google.inject.Guice
import wilson.guice.redis_connection.Service.CacheService
import wilson.guice.redis_connection.module.RealModule

/**
  * Created by wilson on 4/7/17.
  */
object UseCacheComponent {
  val injector = Guice.createInjector(new RealModule)
  val cacheService = injector.getInstance(classOf[CacheService])

  def main(args: Array[String]): Unit = {
    cacheService.cache("a", "b")
    println(cacheService.getValue("a"))
  }
}
