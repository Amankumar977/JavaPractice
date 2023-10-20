package dyamicProgram1;

import java.util.HashMap;

public class Q1 {
	public static HashMap<Integer, Integer> map = new HashMap<>();
	public static int countWays(int n, int m) {
		if (n <= 1) {
			return n;
		}
		if(map.containsKey(n)) {
			return map.get(n);
		} 
		int ways = 0;
		for(int i=1; i<=m && i<=n; i++) {
			ways += countWays(n - i, m);
		} 
		map.put(n, ways);
		return ways;
	}

	public static void main(String[] args) {
		int n = 5;
		int m = 3;
		System.out.println(countWays(n, m));

	}
}
