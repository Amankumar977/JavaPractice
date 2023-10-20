package dyamicProgram1;

public class Q2 {
	public static int trib(int n) {
		int first = 0;
		int second = 1;
		int third = 1;
		for (int i = 3; i <= n; i++) {
			int fourth = first + second + third;
			first = second;
			second = third;
			third = fourth;
		}
		return third;
	}

	public static void main(String[] args) {
		int n = 25;
		System.out.println(trib(n));
	}
}
