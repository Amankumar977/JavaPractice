package dp2;

import java.util.Arrays;

public class Q1 {
	public static void main(String[] args) {
		int[][] grid = { { 0,1,1 }, { 1,1,1 }, {1,1,1} };
		int m = grid.length;
		int n = grid[0].length;
		int count = counting(m, n, grid);
		System.out.println(count);

	}
	private static int counting(int m, int n, int[][] grid) {
		int dp[][] = new int[m + 1][n + 1];
		dp[0][1] = 1;
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (grid[i - 1][j - 1] != 1) {
					dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
				}
			}
		}
		return dp[m][n]; 
	}
}
