package Myproject;

public class Permutation {

	public static void main(String[] args) {
		String str= "abc";
		String p = "";
		printP(str, p);

	}

	private static void printP(String str, String p) {
		if(str.equals("")) {
			System.out.println(p);
			return;
		} 
		for(int i =0; i<str.length();i++) {
			char ch = str.charAt(i);
			String left = str.substring(0, i);
			String right = str.substring(i+1);
			String rem = left+right;
			printP(rem, p+ch);
		}
		
	}

}
