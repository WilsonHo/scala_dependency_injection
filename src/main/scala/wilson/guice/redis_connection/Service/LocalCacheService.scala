package wilson.guice.redis_connection.Service

import scala.collection.mutable.{Map => MMap}
/**
  * Created by wilson on 4/7/17.
  */
class LocalCacheService  extends CacheService {
  val client = MMap[String, String]()

  override def cache(key: String, value: String): Unit = {
    println("LocalCacheService")
    client(key) = value
  }

  override def getValue(key: String): String = client(key)
}
