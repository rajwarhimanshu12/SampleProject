import java.util.Scanner;

public class SortArrayAsc {
	
	public static void SortArrayFun(int arr[],int n) {
		
		int temp;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
						
			}
		}
		System.out.println("Sorted array");
		for(int element : arr) {
			System.out.println(element);
		}
	}
	public static void main(String[] args) {
		
		int n;
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter array elements");
		for(int i=0 ;i<n ; i++) {
			arr[i]=sc.nextInt();
		}
		
		SortArrayFun(arr,n);
		
	}

}
