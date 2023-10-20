package priorityQueue;

import java.util.*;

public class Q2 {

	public static void main(String[] args) {
		int num1[] = { 1, 7, 11 };
		int num2[] = { 2, 4, 6 };
		int k = 3;
		System.out.println(kSmallestPairs(num1, num2, k));

	}

	private static List<List<Integer>> kSmallestPairs(int[] num1, int[] num2, int k) {
		List<List<Integer>> result = new ArrayList<>();
		if (num1.length == 0 || num2.length == 0) {
			return result;
		}
		PriorityQueue <int[]> minHeap = new PriorityQueue <>((a,b)->(a[0]+a[1])- (b[0]+b[1]));
	    for(int i=0; i<num1.length; i++) {
	    	for(int j =0; j<num2.length; j++) {
	    		minHeap.offer(new int[] {num1[i], num2[j]});
	    	}
	    }
	    while(k -- >0 && !minHeap.isEmpty()) {
	    	int pair[]= minHeap.poll();
	    	result.add(Arrays.asList(pair[0], pair[1]));
	    }
	   return result;
	}
}
