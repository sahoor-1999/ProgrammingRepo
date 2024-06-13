package pkg1;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
	public static void main(String[] args) {
		String ss = "nsadfsldfsadfhhbhbshdf";
		List<String> al = new ArrayList<>();
		
		al.add("apple");
//		al.add("banana");
//		al.add("cabbege");
//		al.add("cucumber");
		al.add(ss);
		
		List<String> results = removeDuplicateCharacter(al);
		
		for(String result : results) {
			System.out.println(result + " ");
		}
	}

	private static List<String> removeDuplicateCharacter(List<String> list) {
		
		List<String> resultList = new ArrayList<>();
		
		for(String str : list) {
			StringBuilder sb = new StringBuilder();
			 boolean[] seen = new boolean[256]; // Assuming ASCII characters
			 
			 for(char c : str.toCharArray()) {
				if(!seen[c] && c!= ' ') {
					sb.append(c);
					seen[c]=true;
				}
			 }
			 resultList.add(sb.toString());
		}
		return resultList;
	}
}
