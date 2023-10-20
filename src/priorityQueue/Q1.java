package priorityQueue;

import java.util.*;

public class Q1 {

	public static void main(String[] args) {
      String s = "aab";
      String s2 = "aaab";
      System.out.println(rearrangeString(s));
	}

	private static String rearrangeString(String s) {
		Map <Character, Integer> charCount = new HashMap<>();
		for(char c: s.toCharArray()) {
			charCount.put(c,  charCount.getOrDefault(c, 0)+1);
		}
		PriorityQueue<Character> maxHeap = new PriorityQueue<>((a,b)-> charCount.get(b)-charCount.get(a));
		maxHeap.addAll(charCount.keySet());
		StringBuilder result = new StringBuilder();
		while(!maxHeap.isEmpty()){
			char current = maxHeap.poll();
			result.append(current);
			charCount.put(current, charCount.get(current)-1);
			if(charCount.get(current)>0) {
				maxHeap.offer(current);
			}
		}
		return result.length()== s.length() ? result.toString(): "";
	}
}
