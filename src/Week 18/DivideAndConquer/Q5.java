package DivideAndConquer;

import java.util.Arrays;
import java.util.LinkedList;

public class Q5 {

    public static void main(String[] args) {
        int arr[][]= {{1,3}, {6,8}, {4,5}, {12,15}};
        boolean isCollapsed= false;
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
       LinkedList<int []> merged= new LinkedList<>();
       for(int[] item:arr ) {
    	   if(merged.isEmpty() || merged.getLast()[1]< item[0]) {
    		   merged.add(item);
    	   } else {
    		   isCollapsed= true;
    		   break;
    	   }
       }
       if(isCollapsed) {
    	   System.out.println(true);
       } else {
    	   System.out.println(false);
       }
        
        
    }
}
