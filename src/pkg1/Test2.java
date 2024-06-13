package pkg1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test2 {
	
	//method to find the duplicate of string with occurrence from the list
	public static Map<String, Integer> findDuplicate(List<String> list){
		
		//create two variable which will hold the duplicate string and its count
		Map<String, Integer> countItem = new HashMap<>();
		Map<String, Integer> duplicateItem = new HashMap<>();
		
		//Iterate the list accordingly
		for(String str : list) {
			//check if the item is present in the map or not if not then else will execute and put that item wit count 1 into the map.
			//Then again check for the next item...
			//For the exist value if condition will be execute and if present then it will increase the count +1 and then put the update in to the existing record.
			if(countItem.containsKey(str)) {
				int count = countItem.get(str) + 1;
				countItem.put(str, count);
				
				duplicateItem.put(str, count);
			}else {
				countItem.put(str, 1);
			}
		}
	return countItem;	
	}
	public static void main(String[] args) {
		//add the string into a list
		List<String> al = new ArrayList<>();
		al.add("apple");
		al.add("banana");
		al.add("Mango");
		al.add("apple");
		al.add("apple");
		al.add("apple");
		al.add("apple");
		al.add("banana");
		
		//Calculate the duplicate string with their occurrence
		Map<String, Integer> entry = findDuplicate(al);
		
		for(Map.Entry<String, Integer> entries : entry.entrySet()) {
			System.out.println("The item " + entries.getKey() + " occurs " + entries.getValue() +" times");
		}
	}
}
