package Myproject;

import java.util.Arrays;

public class Launch {
 
	public static void main(String[] args) {
	   int arr [] = {1,2,3,4,3};
	   int n = arr.length, i =1, j= n-1;
	   System.out.println(helper(arr, i, j, n));
	}

	private static int helper(int[] arr, int i, int j, int n) {
	    int dp[][] = new int [n][n];
	    for(int [] row:dp) {
	    	Arrays.fill(row, -1);
	    }
		return minOper(arr, i, j, dp);
	}

	private static int minOper(int[] arr, int i, int j, int[][] dp) {
	    if(i ==j) {
	    	return 0;
	    }
	    if(dp[i][j] != -1) {
	    	return dp[i][j];
	    }
	    int minopr = Integer.MAX_VALUE;
	    for(int k =i ; k<j; k++) {
	    	int operations = minOper(arr, i, k, dp)+ minOper(arr, k+1, j, dp)+arr[i-1]*arr[k]*arr[j];
	    	minopr = Math.min(operations, minopr);
	    }
	    dp[i][j] = minopr;
		return minopr;
	}
}  
