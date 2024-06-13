package pkg1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Test1 {
	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		al.add("e");
		al.add("a");
		al.add("b");
		al.add("c");

		System.out.println(al);
		int count = 0;
		for (String a : al) {
			if (a.equals("d")) {
				count++;
			}
		}
		System.out.println(count);

		Map<String, Integer> main = findDuplicates(al);
		
		for(Map.Entry<String, Integer> entry : main.entrySet()) {
			System.out.println("The string \"" + entry.getKey() + "\" occurs " + entry.getValue() + " times.");
		}
	}

	public static Map<String, Integer> findDuplicates(List<String> list) {
		Map<String, Integer> count = new HashMap<>();
		Map<String, Integer> duplication = new HashMap<>();
		
		for(String str:list) {
			if(count.containsKey(str)) {
				int count1 = count.get(str) + 1;
				count.put(str, count1);
				
				duplication.put(str, count1);
			}else {
				count.put(str, 1);
			}
		}
		return duplication;
	}
}