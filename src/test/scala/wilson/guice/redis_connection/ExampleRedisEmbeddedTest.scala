package wilson.guice.redis_connection

import com.google.inject.Guice
import com.redis.RedisClient
import org.scalatest.{BeforeAndAfterAll, FunSuite}
import wilson.guice.redis_connection.component.IComponent
import wilson.guice.redis_connection.module.RedisEmbeddedModule

/**
  * Created by wilson on 4/7/17.
  */
class ExampleRedisEmbeddedTest extends FunSuite
  with BeforeAndAfterAll {
  val client = new RedisClient("localhost", 6379, 10)


  private lazy val injector = Guice.createInjector(new RedisEmbeddedModule)
  private lazy val component: IComponent = injector.getInstance(classOf[IComponent])

  override protected def beforeAll(): Unit = {
    client.flushall
    super.beforeAll()
  }

  override protected def afterAll(): Unit = {
    client.flushall
    super.afterAll()
  }

  test("CacheSomethingPlusOne") {
    val result = component.CacheSomethingPlusOne("bao", "321")
    println(s"result = $result")
    assert(result == "3211")
  }
}
