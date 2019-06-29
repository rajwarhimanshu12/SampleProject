import java.util.Scanner;

public class reverseArray {
	
	public static void reverseArrayFun(int arr[],int n) {
		int temp;
		for(int i=0;i<n/2;i++) {
			temp = arr[n-i-1];
			arr[n-i-1]=arr[i];
			arr[i]=temp;
			
		}
		
		for(int element : arr) {
			System.out.println(element);
		}
		
	}
	
	public static void main(String args[]) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array \n");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter Array Elements 5");
		for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
		}
		reverseArrayFun(arr,n);
	}

}
