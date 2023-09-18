package DivideAndConquer;

public class Q1 {

	public static void main(String[] args) {
		int arr[] = { 3, 8, 6, 7, 5, 9, 10 };
		int i =0;
		int j = -1;
		int firstSwap = -1;
		int secondSwap = -1;
		 while(i <arr.length-1) {
			 if(arr[i] <= arr[i+1]) {
				 i++;
			 } else {
				 if(j ==-1) {
					j= i+1;
					 firstSwap=i;
				 } else {
					 secondSwap =i+1;
					 break;
				 } 
				 i++;
			 }
		 }
		 int temp = arr[firstSwap];
		 arr[firstSwap]= arr[secondSwap];
		 arr[secondSwap] =temp;
		 for(int eelem:arr) {
			 System.out.println(eelem);
		 }
	}
}
