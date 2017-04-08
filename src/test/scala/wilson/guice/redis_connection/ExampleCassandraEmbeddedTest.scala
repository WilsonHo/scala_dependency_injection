package wilson.guice.redis_connection

import java.util.UUID

import com.datastax.driver.core.Cluster
import com.typesafe.config.ConfigFactory
import org.apache.cassandra.cql3.ResultSet
import org.cassandraunit.CassandraCQLUnit
import org.cassandraunit.dataset.cql.ClassPathCQLDataSet
import org.cassandraunit.utils._
import org.scalatest.concurrent.ScalaFutures
import org.scalatest._

/**
  * Created by wilson on 4/8/17.
  */
class ExampleCassandraEmbeddedTest extends FunSuite
  with BeforeAndAfterAll
  with Matchers
  with Inspectors
  with ScalaFutures
  with OptionValues {
//  val cassandraCQLUnit: CassandraCQLUnit = new CassandraCQLUnit(new ClassPathCQLDataSet("sample.cql", "TestKeyspace"));


  override protected def beforeAll(): Unit = {
    EmbeddedCassandraServerHelper.startEmbeddedCassandra()
    super.beforeAll()
  }

  override protected def afterAll(): Unit = {
    EmbeddedCassandraServerHelper.cleanEmbeddedCassandra();
    super.afterAll()
  }


  test("CacheSomethingPlusOne") {
    val cluster = Cluster.builder()
      .addContactPoint("localhost")
      .withPort(9142)
      .build()
    val session = cluster.connect()
    val result = session.execute("SELECT now() FROM system.local;")
    println(s"result = ${result.one()}")
//    result
    //    val result: ResultSet = cassandraCQLUnit.session.execute("select * from student WHERE id='key1'");
    //    assertThat(result.iterator().next().getString("name"), is("Shukla"));
    assert("" === "")
  }
}
