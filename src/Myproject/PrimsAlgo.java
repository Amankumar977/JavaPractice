package Myproject;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimsAlgo {
	public static int spanningTree(int v, ArrayList<ArrayList<ArrayList<Integer>>> adj ) {
		boolean vis [] = new boolean[v];
		PriorityQueue<int []> pq= new PriorityQueue<>((a, b)-> a[1]- b[1]);
		pq.add(new int [] {0,0});
		int cost =0;
		while(!pq.isEmpty()) {
			int x [] = pq.remove();
			if(vis[x[0]]== true)
				continue;
			vis[x[0]] = true;
			cost += x[1];
			for(ArrayList<Integer> i : adj.get(x[0])) {
				int V = i.get(0);
				int w = i.get(1);
				pq.add(new int [] {V, w});
			}
		}
		return cost;
	}
	public static void main(String[] args) {
		int v = 4;
		ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();
       for(int i=0; i<v; i++) {
    	   adj.add(new ArrayList<>());
       }
       // This is first arryaList
       adj.get(0).add(new ArrayList<>());
       adj.get(0).get(0).add(1);
       adj.get(0).get(0).add(2);
       // This is Second arryaList
       adj.get(0).add(new ArrayList<>());
       adj.get(0).get(1).add(2);
       adj.get(0).get(1).add(3);
       // This is Third arryaList
       adj.get(1).add(new ArrayList<>());
       adj.get(1).get(0).add(2);
       adj.get(1).get(0).add(1);
       // This is Third arryaList
       adj.get(1).add(new ArrayList<>());
       adj.get(1).get(1).add(3);
       adj.get(1).get(1).add(4);
       // This is Third arryaList
       adj.get(2).add(new ArrayList<>());
       adj.get(2).get(0).add(3);
       adj.get(2).get(0).add(5);
       int cost = spanningTree(v, adj);
       System.out.println(cost);
	}
}
