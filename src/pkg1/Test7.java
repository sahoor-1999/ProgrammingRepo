package pkg1;

import java.util.*;

public class Test7 {
	public static void main(String[] args) {
		List<String> al = new ArrayList<>();

		al.add("apple");
		al.add("apple");
		al.add("Banana");
		al.add("Pina-apple");
		al.add("cabbage");
//		al.add("apple");
//		al.add("apple");
//		al.add("apple");
//		al.add("apple");
//		al.add("apple");
//		al.add("apple");
//		al.add("apple");
//		al.add("apple");
//		al.add("apple");
//		al.add("apple");

		List<String> results = reverseWord(al);
		System.out.println(results);
	}

	public static List<String> reverseWord(List<String> list) {

		List<String> revList = new ArrayList<>();

		for (String str : list) {
			StringBuilder sb = new StringBuilder(str);
			String str1 = sb.reverse().toString();
			int index;
			if (revList.contains(str) || revList.contains(str1)) {
				if (revList.contains(str)) {
					index = revList.indexOf(str);
					revList.remove(str);
				} else {
					index = revList.indexOf(str1);
					revList.remove(str1);
				}
				revList.add(index, sb.toString());
			} else {
				revList.add(sb.toString());
			}
		}
		return revList;
	}
}
