package pkg1;

import java.util.ArrayList;
import java.util.List;

public class Test6 {

	public static List<String> findDuplicate(List<String> list) {

		List<String> mainResult = new ArrayList<>();
		
		for(String str : list) {
			StringBuilder sb = new StringBuilder();
			boolean[] bool = new boolean[256];
			
			for(char c : str.toCharArray()) {
				if(!bool[c] && c!=' ' && Character.isLetter(c)) {
					sb.append(c);
					bool[c]=true;
				}
			}
			mainResult.add(sb.toString());
		}

		return mainResult;
	}

public static void main(String[] args) {
	
	List<String> al = new ArrayList<>();
	
	al.add("asjdjas");
	al.add("asdasd kasldllad 32@@!@@*");
	al.add("abkjdasd");
	al.add("ansdnncjbjk     ");
	
	List<String> result = findDuplicate(al);
	System.out.println(result);
}
}
