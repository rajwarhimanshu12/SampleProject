import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateInSentence {
	
	public static void fun(String s) {
		String [] arr = s.split(" ");
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		for(String word : arr) {
			if(hm.containsKey(word)) {
				hm.put(word,hm.get(word)+1);
			}
			else
				hm.put(word,1);
				
		}
		for(Map.Entry entry : hm.entrySet()) {
			int count = (int) entry.getValue();
			if(count>1)
			{
				 System.out.println("Duplicate words are"+entry.getKey());
			}
				
		}
	}
	
public static void main(String args[]) {
	   System.out.println("Enter a sentence");
	   Scanner sc = new Scanner(System.in);
	   String sentence = sc.nextLine();
       fun(sentence);
}	
}




