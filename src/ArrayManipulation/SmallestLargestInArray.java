package ArrayManipulation;

import java.util.Scanner;

public class SmallestLargestInArray {
	

	public static void main(String[] args) {
		
		System.out.println("Enter the Size");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr [] = new int [n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
			int smallest= arr[0];
			int largest = arr[0];
			
			for(int i=1;i<n;i++) {	
				if(arr[i]>largest) {
					largest=arr[i];
				}
				else if(arr[i]<smallest) {
					smallest=arr[i];
				}
			
		}
			System.out.println("largest is"+largest);
			System.out.println("Smallest is"+smallest);
		

	}

}
