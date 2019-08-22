package ArrayManipulation;

import java.util.Scanner;

public class twoDarray {
	
	public static void fun(int arr[][],int rowsize,int columnsize) {
		
		System.out.println("Array");
		for(int i=0;i<rowsize;i++) {
			for(int j=0;j<columnsize;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		
	}
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rowsize=sc.nextInt();
		System.out.println("Enter the number of columns");
		int columnsize=sc.nextInt();
		int [][] arr = new int[rowsize][columnsize];
		System.out.println("Enter Array Elements");
		for(int i=0;i<rowsize;i++) {
			for(int j=0;j<columnsize;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		fun(arr,rowsize,columnsize);
		
	
		
		

	}

}
