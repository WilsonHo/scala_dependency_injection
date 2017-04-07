package wilson.guice.redis_connection.component

/**
  * Created by wilson on 4/7/17.
  */
trait IComponent {
  def CacheSomethingPlusOne(key: String, value: String): String
}
