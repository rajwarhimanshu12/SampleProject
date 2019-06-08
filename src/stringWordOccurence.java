import java.util.Scanner;

public class stringWordOccurence {
	
	public static int countocc(String s,String word) {
		int count=0;
		String a[] = s.split(" ");
		for(int i=0;i<a.length;i++) {
			if(word.equals(a[i])) {
			count++;	
			}
		}
		return count;
		
	}
	
	public static void main(String[] args)
	{
		String s = "find the occurence of the word";
		System.out.println("Enter the word whose occurence needs to be found");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		System.out.println(countocc(s,word));
		
		
		
	}
}
