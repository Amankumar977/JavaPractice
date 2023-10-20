package Myproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Kruskal {
	static int v = 4;
	static int[] parent = new int [v];
	static int find(int i) {
		if(parent[i]== i)
			return i;
		return find(parent[i]);
	}
	static void union(int x, int y) {
		int a = find(x);
		int b = find(y);
		parent[b] = a;
	}
	public static int minimumSpannigTree(ArrayList<int[]> edges ) {
		Collections.sort(edges, Comparator.comparingInt(a->a[2]));
		int cost =0;
		for(int i=0; i<v; i++) {
			parent[i] = i;
		}
		for(int i[]:edges) {
			int u= i[0];
			int V= i[1];
			int w= i[2];
			if(find(u) != find(V)) {
				cost += w;
				union(u, V);
			}
		}
		return cost;
	}
	public static void main(String[] args) {
		ArrayList<int[]> edges = new ArrayList<>();
		edges.add(new int[] { 0, 1, 2 });
		edges.add(new int[] { 0, 2, 3 });
		edges.add(new int[] { 1, 3, 4 });
		edges.add(new int[] { 1, 2, 1 });
		edges.add(new int[] { 2, 3, 5 });
		int cost = minimumSpannigTree( edges);
		System.out.println("Yeah The cost is " + cost);
	}
}
