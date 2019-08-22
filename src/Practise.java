import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Practise {
	
public static void main(String args[]) {
	   System.out.println("Enter a sentence");
	   Scanner sc = new Scanner(System.in);
	   String sentence = sc.nextLine();
       String withoutSpace = sentence.replaceAll("\\s+","");
       System.out.println(withoutSpace);
       
}	
}

