import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumFrequencyArray {
	
	public static void NumFrequencyArray(int arr[],int n) {
		HashMap<Integer,Integer>  hm = new HashMap<Integer,Integer>();
		for(int element : arr) {
			if(hm.containsKey(element)) {
				hm.put(element,hm.get(element)+1);
			}
			else
				hm.put(element,1);
		}
		
		for(Map.Entry entry : hm.entrySet()) {
			System.out.println(entry.getKey()+ "    "+entry.getValue());
		}
	}

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}	
		
		NumFrequencyArray(arr,n);

	}

}
