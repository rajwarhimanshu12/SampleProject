import java.util.Arrays;

public class smallestLargestInArray {
	
	public static void main(String[] args) {
		
		int numbers[] = {-10,22,88,-24,7897};
		int largest = numbers[0];
		int smallest = numbers[0];
		
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]>largest) {
				largest=numbers[i];
			}
			else if (numbers[i]<smallest) {
				smallest=numbers[i];
			}
		}
		
		System.out.println(Arrays.toString(numbers));
		System.out.println("Smallest is"+ smallest);
		System.out.println("largest is"+largest);		
		
	}
}
