package edu.kit.aifb.janusimplementation;

import org.janusgraph.core.JanusGraph;
import org.janusgraph.core.JanusGraphFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		
		JanusGraphFactory.Builder config = JanusGraphFactory.build();
		
		config.set("clusterConfiguration.hosts", "aifb-ls3-vm1.aifb.kit.edu");
		config.set("clusterConfiguration.port", 8182);
//		config.set("clusterConfiguration.serializer.className", "org.apache.tinkerpop.gremlin.driver.ser.GryoMessageSerializerV1d0");
//		config.set("clusterConfiguration.serializer.config.ioRegistries", ioRegistries); // (e.g. [ org.janusgraph.graphdb.tinkerpop.JanusGraphIoRegistry) ]
		config.set("gremlin.remote.remoteConnectionClass", "org.apache.tinkerpop.gremlin.driver.remote.DriverRemoteConnection");
		config.set("gremlin.remote.driver.sourceName", "g");

	     JanusGraph graph = config.open();
	     graph.query();
	}
}
