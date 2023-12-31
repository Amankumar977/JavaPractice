package dyamicProgram1;

import java.util.Arrays;

public class Q4 {

	public static void main(String[] args) {
		int m = 3;
		int n = 7;
		int ways = findWays(m-1, n-1 );
		System.out.println(ways);
	}

	private static int findWays(int m, int n) {
		int dp[][] = new int[m + 1][n + 1];
		for (int i = 1; i <= m; i++) {
			dp[i][0] = 1;
		}
		for (int j = 1; j <= n; j++) {
			dp[0][j] = 1;
		}
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
             dp[i][j] = dp[i-1][j] + dp[i][j-1];
			}
		}
      return dp[m][n]; 
	}
}