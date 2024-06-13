package pkg1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test3 {

	public static Map<String, Integer> removeDuplicate(List<String> list){
		
		Map<String, Integer> rmd = new HashMap<>();
		List<String> uniValue = new ArrayList<>();
		
		for(String str : list) {
			if(rmd.containsKey(str)){
				rmd.put(str, rmd.get(str) + 1);
			}else {
				rmd.put(str, 1);
				uniValue.add(str);
			}
		}
		list.clear();
		list.addAll(uniValue);
		return rmd;
	}
	
	public static List<String> findDup(List<String> list){
		List<String> rmvDup = new ArrayList<>();
		for(String str : list) {
			if(rmvDup.contains(str)) {
				int i = rmvDup.indexOf(str);
				rmvDup.remove(str);
				rmvDup.add(i, str);
			}else {
				rmvDup.add(str);
			}
		}
		list.clear();
		return rmvDup;
	}
	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		al.add("Apple");
		al.add("Banana");
		al.add("Pina-apple");
		al.add("Mango");
		al.add("jack fruit");
		al.add("Apple");
		al.add("Banana");
		al.add("Pina-apple");
		
		System.out.print("Value present with duplicate: ");
		for(String k:al) {
		System.out.print(k + ", ");
		}
		
		Map<String, Integer> entry = removeDuplicate(al);
		System.out.println();
		System.out.print("Value after remove duplicate: ");
		for(Map.Entry<String, Integer> entries : entry.entrySet()) {
			System.out.print(entries.getKey() + ", ");
		}
		
		List<String> uniq = findDup(al);
		System.out.println();
		System.out.print("Value after remove duplicate: ");
			for(String s : uniq) {
				System.out.print(s + ", ");
			}
	}
}
