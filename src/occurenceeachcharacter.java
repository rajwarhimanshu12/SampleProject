import java.util.HashMap;
import java.util.Map;

public class occurenceeachcharacter {
	
	public static void counteachocc(String str) {
       HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
      
		char[] arr = str.toCharArray();
		for (char c: arr) {
			if(hm.containsKey(c)){
				hm.put(c,hm.get(c)+1);
			}
			else
				hm.put(c,1);
			
		}
		
		for(Map.Entry entry : hm.entrySet()) {
			System.out.println(entry.getKey()+"  "+entry.getValue());			
		}
		
		
	}
	
	public static void main(String[] args) {
		String str = "findtheoccurenceofeachcharacter";
		counteachocc(str);
		
	}

}
