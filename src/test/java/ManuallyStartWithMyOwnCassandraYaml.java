//import org.cassandraunit.utils.EmbeddedCassandraServerHelper;

import org.apache.thrift.transport.TTransportException;
import org.cassandraunit.utils.EmbeddedCassandraServerHelper;

import java.io.IOException;

/**
 * Created by wilson on 4/8/17.
 */
public class ManuallyStartWithMyOwnCassandraYaml {
    public static void main(String[] args) throws IOException, TTransportException, InterruptedException {
//        EmbeddedCassandraServerHelper.startEmbeddedCassandra("/Users/wilson/IdeaProjects/scala_dependency_injection/src/test/resources/cassandra.yaml");
        EmbeddedCassandraServerHelper.startEmbeddedCassandra("/Users/wilson/IdeaProjects/scala_dependency_injection/src/test/resources/cassandra.yaml");

    }
}