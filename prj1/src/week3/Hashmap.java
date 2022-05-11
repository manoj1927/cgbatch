package week3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<String,String> h = new HashMap<String,String>();
		
		h.put("1", "a");
		h.put("2", "e");
		h.put("3", "i");
		h.put("4", "o");
		h.put("5", "u");
		
		 Set set = h.entrySet();
	     
	      Iterator i = set.iterator();
		 while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
	      }

	}

}
