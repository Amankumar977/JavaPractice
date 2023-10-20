package dp2;

import java.util.Arrays;

public class Q2 {

	public static void main(String[] args) {
		int nums[] = {1,5, 2,8,9};
		int n = nums.length;
		System.out.println(maxMoney(nums, n-1));
	}

	private static int maxMoney(int[] nums, int n) {
		int dp[] = new int [n+1];
		dp[0] = nums[0];
		dp[1] = Math.max(nums[0], nums[1]);
		for(int i =2; i<=n; i++) {
			dp[i] = Math.max(dp[i-1], nums[i]+ dp[i-2]);
		} 
		return dp[n]; 
	}
}  
