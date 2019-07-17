package ArrayManipulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateInArray {
	
	public static void DuplicateInArrayfun(int [] arr) {
		
	Map <Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i : arr) {
			if(map.get(i)==0) {
				map.put(i,1);
			}
			else
				map.put(i,map.get(i)+1);
		}  
		
	    for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
	    {               
	        if(entry.getValue() > 1)
	        {
	            System.out.println("Duplicate Element : "+entry.getKey()+" - found "+entry.getValue()+" times.");
	        }
	    }
		
	}

	public static void main(String[] args) {
		int [] arr = new int [] {1,2,3,4,4,5,6,7,9};
	 	DuplicateInArrayfun(arr);
	}

}
