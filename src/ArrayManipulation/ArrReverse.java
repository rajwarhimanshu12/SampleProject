package ArrayManipulation;

import java.util.Scanner;

public class ArrReverse {
	
	public static void ArrReverseFun(int arr[],int n){
		
		int j=n-1;
		int temp=0;
		for(int i=0;i<n/2;i++) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j--;
		}
		System.out.println("The reversed Array is");
		for(int elements: arr) {
			System.out.println(elements);
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
		
		ArrReverseFun(arr,n);

	}


	}

