package Myproject;

import java.util.*;

public class Prim {
	public static int minimumSpannigTree(int v,ArrayList<int []> edges ) {
		boolean vis [] = new boolean [v];
		PriorityQueue<int []> pq = new PriorityQueue<>((a, b)->a[2]- b[2]);
	    pq.add(new int [] {0,0,0});
	    int cost =0;
	    while(!pq.isEmpty()) {
	    	int x [] = pq.remove();
	    	if(vis[x[1]]== true) {
	    		continue;
	    	}
	    	vis[x[1]]= true;
	    	cost += x[2];
	    	for(int i []: edges) {
	    		if(i[0] == x[1] && !vis[i[1]]) {
	    			pq.add(new int [] {x[1], i[1], i[2]});
	    		}
	    		if(i[1] == x[1] && !vis[i[0]]) {
	    			pq.add(new int [] {x[1], i[0], i[2]});
	    		}
	    	}
	    }
		
		return cost;
	}

	public static void main(String[] args) {
		int v = 4;
		ArrayList<int []> edges = new ArrayList<>();
        edges.add(new int [] {0,1,2});
        edges.add(new int [] {0,2,3});
        edges.add(new int [] {1,3,4});
        edges.add(new int [] {1,2,1});
        edges.add(new int [] {2,3,5});
        int cost = minimumSpannigTree(v, edges);
        System.out.println("Yeah The cost is "+ cost);
	}
}
 