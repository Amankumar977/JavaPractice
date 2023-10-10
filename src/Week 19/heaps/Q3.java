package heaps;

import java.util.*;

public class Q3 {

    public static void main(String[] args) {
        String words[] = {"the","day","is","sunny","the","the","the","sunny","is","is"};
        int k = 5;
        
        Map<String, Integer> wordFreq = new HashMap<>();
        for (String word : words) {
            wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<Map.Entry<String, Integer>> minHeap = new PriorityQueue<>(
                Comparator.<Map.Entry<String, Integer>>comparingInt(Map.Entry::getValue)
                        .thenComparing(Map.Entry::getKey));

        for (Map.Entry<String, Integer> entry : wordFreq.entrySet()) {
            minHeap.offer(entry);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        List<String> result = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            result.add(0, minHeap.poll().getKey());
        }

        System.out.println(result);
    }
}
