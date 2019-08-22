import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class reverseStringUsingList {

	public static void main(String[] args) {
	 
		System.out.println("Enter the String to be reversed");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char [] charArr = s.toCharArray();
		
		List<Character> l = new ArrayList<Character>();
		for(char character:charArr) {
			l.add(character);
		}

		Collections.reverse(l);
		ListIterator li = l.listIterator();
		while(li.hasNext()){
			System.out.print(li.next());
		}
	}

}
