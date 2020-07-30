package jenkins;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class sum {
	public static void main (String[]args) {
		String str []= {"aa","bb","cc","dd"};
		int num []= {10,20,30,40};
		HashMap<String,Integer>st = new HashMap<>();
		for(String count:str) {
			if(!st.containsKey(count)) {
				st.put(count, 1);
			}
			else {
				
			}
		}
	for(Entry<String,Integer>it:st.entrySet()) {
		String name= it.getKey();
		int value=it.getValue();
		System.out.println(name+" "+value);
	}
}
}