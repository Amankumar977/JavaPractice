package Myproject;

public class maxHeap {
	public static void main(String[] args) {
      int arr[]= {1,3,5,4,6,13,10,9,8,15,17};
      int n = arr.length;
      maxHeap(arr, n);
      for(int i=0; i<n; i++) {
    	  System.out.print(arr[i]+" ");
      }
      System.out.println(" ");
	}

	private static void maxHeap(int[] arr, int n) {
		int start = (n/2)-1;
		for(int i = start; i>=0; i--) {
			heapify(arr, n, i);
		}
		
	} 

	private static void heapify(int[] arr, int n, int i) {
		int largest = i;
		int leftIdx= 2*i+1;
		int rightIdx = 2*i+2;
		if(leftIdx <n && arr[leftIdx] > arr[largest]) {
			largest = leftIdx;
		}
		if(rightIdx <n && arr[rightIdx] > arr[largest]) {
			largest = rightIdx;
		}
		if(largest != i) {
			int temp = arr[i];
			arr[i]= arr[largest];
			arr[largest] = temp;
			heapify(arr, n, largest);
		}
	}
}
