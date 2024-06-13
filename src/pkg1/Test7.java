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

		List<String> results = reverseWord(al);
		System.out.println(results);
	}

	public static List<String> reverseWord(List<String> list) {

		List<String> revList = new ArrayList<>();

		for (String str : list) {
			StringBuilder sb = new StringBuilder(str);
			if(revList.contains(str) || revList.contains(sb.reverse().toString())) {
				int i = revList.indexOf(str);
				revList.remove(str);
				sb.reverse();
				revList.add(i, sb.toString());
			}else {
				sb.reverse();
				revList.add(sb.toString());
			}
		}
		return revList;
	}
}
