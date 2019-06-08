import java.util.Scanner;

public class stringcharOccurence {

	public static int countocc(String s,char c) {
		
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == c )
			{
				count++;
			}
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		String s="check the occurence of e in this string";
	
		System.out.println("Enter the character whose occurence you want to find");
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		countocc(s,c);
		System.out.println(countocc(s,c));
		
				
	}
	
	
}
