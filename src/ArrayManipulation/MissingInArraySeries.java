package ArrayManipulation;

public class MissingInArraySeries {
	
	public static int MissingInArraySeriesFun(int [] arr, int count) {
		int expectedsum= count*((count+1)/2);
		int actualsum=0;
		for(int i : arr) {
			actualsum+=i;
		}
		return expectedsum-actualsum;
	}
	public static void main(String args[]) {
		
		int [] arr = new int [] {1,2,3,4,5,6,7,9};

		System.out.println("missing element is"+MissingInArraySeriesFun( arr,9));
		
	}

}
