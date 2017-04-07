package wilson.guice.redis_connection.Service

/**
  * Created by wilson on 4/7/17.
  */
trait CacheService {
  def cache(key: String, value: String)

  def getValue(key: String): String
}
