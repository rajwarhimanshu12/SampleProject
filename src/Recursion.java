import java.util.Scanner;

public class Recursion {
	
	public static int RecursionFun(int n) {
		if(n==1) {
			return 1;
		}
		else
			return (n*RecursionFun(n-1));
	}
	
	public static void main(String args[]) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Factorial is"+RecursionFun(n));
	}

}
