package Greedy;

public class Q4 {

	public static void main(String[] args) {
		int flowerbed[] = { 1, 0, 0, 0, 1 };
		int n = 2;
		System.out.println(isPossible(flowerbed, n));
	}

	private static boolean isPossible(int[] arr, int k) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			if (arr[i - 1] == 0 && arr[i] == 0) {
				arr[i]=1;
				k--;
			}
		}
		if(k == 0) {
			return true;
		} else {
			return false;
		} 
	} 
}
