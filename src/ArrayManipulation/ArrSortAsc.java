package ArrayManipulation;

import java.util.Scanner;

public class ArrSortAsc {
	
	public static void ArrsortAscFun(int arr[], int n) {
		int temp;
		for(int i =0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[j]=temp;
					arr[i]=arr[j];
				}
			}
		}
		
		System.out.println("Sorted Array");
		for(int elements : arr) {
			System.out.println(elements);
		}
	}
	
	public static void main(String args[]) {
		
		System.out.println("Enter the size");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter Array Elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		ArrsortAscFun(arr,n);
		
	}

}
