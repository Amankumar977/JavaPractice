package Myproject;

import java.util.*;

public class Graph {
	
	public static void addEdge(ArrayList<ArrayList<Integer>> adj , int u , int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}

	public static void main(String[] args) {
		int v = 4;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>(v);
		for(int i=0; i< v; i++) {
			adj.add(new ArrayList<>());
		}
		addEdge(adj, 0, 1);
		addEdge(adj, 0, 2); 
		addEdge(adj, 1, 3);
		addEdge(adj, 2, 3);
		System.out.println(adj);
	}  
}
