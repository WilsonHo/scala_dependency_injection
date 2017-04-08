package wilson.guice.redis_connection

import com.google.inject.Guice
import org.scalatest.{BeforeAndAfterAll, FunSuite}
import wilson.guice.redis_connection.component.{IComponent, RunningComponent}
import wilson.guice.redis_connection.module.RedisLocalModule

/**
  * Created by wilson on 4/7/17.
  */
class ExampleRedisLocalTest extends FunSuite
  with BeforeAndAfterAll {
  private val injector = Guice.createInjector(new RedisLocalModule)
  val component: RunningComponent = injector.getInstance(classOf[RunningComponent])

  override protected def beforeAll(): Unit = {
    super.beforeAll()
  }

  override protected def afterAll(): Unit = {
    super.afterAll()
  }

  test("CacheSomethingPlusOne") {
    val result = component.CacheSomethingPlusOne("bao", "123")
    println(s"result = $result")
    assert(result == "1231")
  }
}
