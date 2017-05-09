package com.build.graph;

import java.util.List;

public class UnDirectedGraph<V> implements Graph<V> {

	int currentIndex=0;
	Object[] vertexs=new Object[10];
	
	Object[][] edges=new Object[vertexs.length][vertexs.length];
	
	public boolean addNode(V v){
		
		vertexs[currentIndex++]=v;
		
		return false;
	}
	
	public boolean removeNode(V v){
		
		return false;
	}
	
	public List<V> adjNodes(){
		
		return null;
	}
	
	public List<V> pathBetweenNodes(V v1,V v2){
		
		return null;
	}
	
	
}
