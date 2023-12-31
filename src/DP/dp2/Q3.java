package dp2;

public class Q3 {

	public static void main(String[] args) {
		int grid[][] = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		int m = grid.length;
		int n = grid[0].length;
		System.out.println(minPath(m, n, grid));
	}

	private static int minPath(int m, int n, int[][] grid) {
		int dp[][] = new int[n + 1][m + 1];
		dp[0][0] = grid[0][0];
		for(int i=1; i<m; i++) {
			dp[i][0] = dp[i-1][0] + grid[i][0];
		}
		for(int i=1; i<m; i++) {
			dp[0][i] = dp[0][i-1] + grid[0][i];
		}
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
			}
		}
		return dp[m-1][n-1];
	}
}
