package Greedy;

public class Q1 {

	public static void main(String[] args) {
		int a [] = {1,2,-3};
		int b [] = {-2,3,-5};
		int k = 5;
		int minValue= Integer.MAX_VALUE;
		int product =0;
		for(int i=0; i<a.length;i++) {
			int IncreasedA = a[i]+(k*2);
			product = IncreasedA*b[i];
			minValue = Math.min(minValue,product );
			int decreasedA = a[i]- (k*-2);
			product = decreasedA *b[i];
			minValue = Math.min(minValue,product );
		}
		System.out.println(minValue);
	}
}
    