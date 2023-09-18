package DivideAndConquer;

public class Q4 {

	public static void main(String[] args) {
		int a[] = {2,1,3};
		int b[] = {7,8,9};
		int k =10;
		boolean isTrue = false; 
		for(int i=0; i<a.length; i++) {
			if(a[i]+b[i] >=k) {
			   isTrue= true;
			   break;
			}
		}
		if(isTrue) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
 
	}  

}
