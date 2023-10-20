package dp2;

public class Q4 {

	public static void main(String[] args) {
		int nums[] = { 1, 5, 11, 5 };
		System.out.println(canPartition(nums));
	}

	public static boolean canPartition(int[] nums) {
		int totalSum = 0;
		for (int num : nums) {
			totalSum += num;
		}

		if (totalSum % 2 != 0) {
			return false; // If total sum is odd, no equal partition is possible.
		}

		int targetSum = totalSum / 2;
		boolean[] dp = new boolean[targetSum + 1];
		dp[0] = true;

		for (int num : nums) {
			for (int i = targetSum; i >= num; i--) {
				dp[i] = dp[i] || dp[i - num];
			}
		}

		return dp[targetSum];
	}
}
