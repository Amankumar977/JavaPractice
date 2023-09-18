package Myproject;

public class Practice {

	public static void main(String[] args) {
      int arr[] = {7,1,3,5,2,6,4};
      int n = arr.length-1;
      quickSort(arr, 0, n);
      for(int item : arr) {
    	  System.out.println(item);
      }
	}

	private static void quickSort(int[] arr, int l, int r) {
		 if(l <r) {
			 int mid = partition(arr, l,r);
			 quickSort(arr, l, mid-1);
			 quickSort(arr, mid+1, r);
		 }
		
	}

	private static int partition(int[] arr, int l, int r) {
		int pivot = arr[r];
		int i = l-1; 
		 for (int j = l; j < r; j++) {
	            if (arr[j] <= pivot) {
	                i++;
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
		int temp = arr[r];
		arr[r]= arr[i+1];
		arr[i+1] = temp;
		return i+1; 
		
	}
}
 