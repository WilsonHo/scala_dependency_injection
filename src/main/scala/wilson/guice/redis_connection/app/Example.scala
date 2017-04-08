package wilson.guice.redis_connection.app

import com.google.inject.Guice
import com.redis.cluster.RedisCluster
import org.junit.Before
import redis.embedded.RedisServer
import wilson.guice.redis_connection.Service.CacheService
import wilson.guice.redis_connection.component.{IComponent, RunningComponent}
import wilson.guice.redis_connection.module.RealModule

/**
  * Created by wilson on 4/7/17.
  */
object Example {
  private val injector = Guice.createInjector(new RealModule)
  val component: RunningComponent = injector.getInstance(classOf[RunningComponent])


  def main(args: Array[String]): Unit = {
    println(component.CacheSomethingPlusOne("abc", "222"))


  }

}
