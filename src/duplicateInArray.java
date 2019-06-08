import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class duplicateInArray {
	public static void main(String[] args)
	// Solution with O(n*n)
	{
		String names[] = { "java", "javascript", "Ruby", "Python", "C", "java" };
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i] == names[j]) {
					System.out.println(names[i]);
				}
			}
		}

//solution using hashset it is a java collection which stoes unique value
//  for(data_type item : collection)
//O(N)
		Set<String> store = new HashSet<String>();
		for (String name : names) {
			if (store.add(name) == false) {
				System.out.println(name);
			}
		}
	
//solution using hashmap
//o(2n)
Map<String,Integer> storeMap = new HashMap<String,Integer>();
  for(String name:names){
     Integer Count = storeMap.get(name);
     if (Count==null){ 
	     storeMap.put(name,1);
     }
     else {
	      storeMap.put(name,++Count);
      }
  }
 //get the value from hashset use entryset

Set<Entry<String,Integer>> entrySet = storeMap.entrySet();  
for(Entry<String,Integer> entry : entrySet) {
	if(entry.getValue()>1) {
		System.out.println(entry.getKey());
	}
}
} 
}	
	