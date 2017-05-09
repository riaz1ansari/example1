package com.build.graph;

import java.util.List;

public interface Graph<V> {

	public boolean addNode(V v);
	
	public boolean removeNode(V v);
	
	public List<V> adjNodes();
	
	public List<V> pathBetweenNodes(V v1,V v2);
	
	
}
