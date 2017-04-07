package wilson.guice.redis_connection.Service

import com.redis.RedisClient

/**
  * Created by wilson on 4/7/17.
  */
case class RedisEmbeddedService(host: String, port: Int) extends CacheService {
  val client = new RedisClient(host, port, 10)

  override def cache(key: String, value: String): Unit = {
    println("RedisEmbeddedService")
    client.set(key, value)
  }

  override def getValue(key: String): String = client.get(key).get
}
