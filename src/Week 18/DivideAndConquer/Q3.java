package DivideAndConquer;

public class Q3 {
	public static void main(String[] args) {
       int arr[]= {19, -20, 7, -4, -13, 11, -5, 3};
       int n= arr.length;
       int i =0 , j=0;
       while(i < n) {
    	   if(arr[i] < 0) {
    		   int temp = arr[i];
    		   arr[i] = arr[j];
    		   arr[j]= temp;
    		   i++;
    		   j++;  
    	   } else {
    		   i++; 
    	   }
       }
       for(int elem:arr) {
    	   System.out.println(elem);
       }
	}
} 
