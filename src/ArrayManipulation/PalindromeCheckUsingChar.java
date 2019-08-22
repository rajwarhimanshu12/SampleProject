package ArrayManipulation;

import java.util.Scanner;

public class PalindromeCheckUsingChar {
	
	
	public static void PalindromeCheckUsingChar(String S) {
		String rev="";
		for(int i = S.length()-1;i>=0;i--){
			rev = rev + S.charAt(i);
		}
		System.out.println("The reverse is"+rev);
		
	if(rev.equals(S)) {
		System.out.println("Palindrome");
	}
	else
		System.out.println("Not a Palindrome");
	}
	public static void main(String[] args) {	
		
		System.out.println("Enter the String/Number");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		PalindromeCheckUsingChar(s);
	}

}
