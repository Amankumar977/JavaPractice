package dyamicProgram1;

public class Q3 {

	public static void main(String[] args) {
		int nums[] = { 2, 7, 9, 3, 1 };
		int n = nums.length;
		System.out.println(rob(nums, n));
	}

	private static int rob(int[] nums, int n) {
		if (n==0) return 0;
		if(n ==1)  return nums[0];
		int arr [] = new int[n];
		arr[0] = nums[0];
		arr[1] = Math.max(nums[0], nums[1]);
		for(int i=2; i<n; i++) {
			arr[i] = Math.max(arr[i-2]+ nums[i], arr[i-1]);
		}
		return arr[n-1];
	}   
} 
 