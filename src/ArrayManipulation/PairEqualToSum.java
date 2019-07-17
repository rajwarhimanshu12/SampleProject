package ArrayManipulation;

import java.util.Scanner;

public class PairEqualToSum {
	
	public static void PairEqualToSum(int[] arr, int sum) {
		int firstnum;
		int Secondnum;
		
		for(int i=0;i<arr.length;i++){
			firstnum=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				Secondnum=arr[j];
				if(sum==(firstnum+Secondnum)) {
					System.out.println("first num"+firstnum+"Second num"+Secondnum);
				}
			}
		}
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array \n");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter Array Elements ");
		for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the sum");
		int sum = sc.nextInt();
		PairEqualToSum(arr,sum);

	}

}
