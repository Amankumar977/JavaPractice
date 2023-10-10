package heaps;

import java.util.PriorityQueue;

public class Q2 {

	public static void main(String[] args) {
		int arr [] = {5,4,2,8};
        int n = arr.length;
        PriorityQueue <Integer> minHeap = new PriorityQueue<>();
        for(int i=0; i<n; i++) {
        	minHeap.add(arr[i]);
        }
        int totalCost =0; 
        while(minHeap.size() >1) {
        	int first = minHeap.poll();
        	int second = minHeap.poll();
        	int cost = first+second;
        	totalCost += cost;
        	minHeap.add(cost);
        }
        System.out.println(totalCost); 
	} 

}
