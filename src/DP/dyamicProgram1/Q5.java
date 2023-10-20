package dyamicProgram1;

import java.util.ArrayList;
import java.util.Arrays;
public class Q5 {

	public static void main(String[] args) {
		 ArrayList<ArrayList<Integer>> tri = new ArrayList<>();
		 ArrayList<Integer> row1 = new ArrayList<>();
		 row1.add(2);
		 tri.add(row1);
		 ArrayList<Integer> row2 = new ArrayList<>();
		 row2.add(3);
		 row2.add(4);
		 tri.add(row2);
		 ArrayList<Integer> row3 = new ArrayList<>();
		 row3.add(6);
		 row3.add(5);
		 row3.add(7);
		 tri.add(row3);
		 ArrayList<Integer> row4 = new ArrayList<>();
		 row4.add(4); 
		 row4.add(1);
		 row4.add(8);
		 row4.add(3);
		 tri.add(row4);
		 int total = minTotal(tri);
		 System.out.println(total);
	}

	private static int minTotal(ArrayList<ArrayList<Integer>> tri) {
		int memo [][] = new int [tri.size()][tri.size()];
		for(int []row: memo) {
			Arrays.fill(row, -1);
		}
		return dfs(tri, 0,0, memo);
	}

	private static int dfs(ArrayList<ArrayList<Integer>> tri, int row, int col, int[][] memo) {
		if(row == tri.size()-1) {
			return tri.get(row).get(col);
		}
		if(memo[row][col] != -1) {
			return memo[row][col];
		}
		int  left = dfs(tri, row+1, col, memo);
		int  right = dfs(tri, row+1, col+1, memo);
		memo[row][col] = tri.get(row).get(col)+ Math.min(left, right);
		return memo[row][col];
	} 
}
