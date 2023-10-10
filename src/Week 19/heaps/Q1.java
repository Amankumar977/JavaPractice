package heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class Q1 {
	public static void main(String[] args) {
		int arr [] = {1,2,3,5,6,9};
        int k = 3;
        int n = arr.length;
        PriorityQueue <Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<n ; i++) {
        	maxHeap.add(arr[i]);
        }
        for(int i=0; i<k-1; i++) {
        	maxHeap.remove();
        }
        System.out.println(maxHeap.peek());
	}
}
