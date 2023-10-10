package Myproject;

public class heapSort {
	public static void heapify(int arr[], int n , int i) {
		int largest  = i;
		int leftIdx = 2*i+1;
		int rightIdx = 2*i+2;
		if (leftIdx <n && arr[leftIdx] > arr[largest]) {
			largest = leftIdx;
		}
		if (rightIdx <n && arr[rightIdx] > arr[largest]) {
			largest = rightIdx;
		}
		if(largest !=i) { 
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			heapify(arr, n,largest );
		}
	}
	public static void maxHeap(int arr[], int n) {
		int start = (n/2)-1;
		for(int i= start ; i>=0; i--) {
			heapify(arr, n, start);
		}
	}
    public static void heapSorting(int arr[], int n) {
    	// first build the heap
    	maxHeap(arr, n);
    	for(int i= n-1; i>=0; i--) {
    		int temp = arr[i];
    		arr[i]= arr[0];
    		arr[0] = temp;
    		heapify(arr, i, 0);
    	}
    }
	public static void main(String[] args) {
        int arr[] = {15,10,1,3,8,9,5,6,14,13};
        int n = arr.length;
        heapSorting(arr,n);
        for(int elem:arr) {
        	System.out.print(elem+" ");
        }
	}
}
