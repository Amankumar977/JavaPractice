package heaps;

import java.util.*;

public class Q4 {

	public static void main(String[] args) {
		int stones[]= {2,7,4,1,8,1};
		int n = stones.length;
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<n; i++) {
        	maxHeap.add(stones[i]);
        }
        while(maxHeap.size() >1) {
        	int first = maxHeap.poll();
        	int second = maxHeap.poll();
        	if(first != second) {
        	 int difference= first-second;
        	 maxHeap.add(difference);
        	}
        }
        System.out.println(maxHeap.isEmpty() ? 0: maxHeap.peek());
	}
}
