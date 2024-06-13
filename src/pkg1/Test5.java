package pkg1;

import java.util.ArrayList;
import java.util.List;

public class Test5 {
	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		
		al.add("aasdcioisd");
		al.add("dcasl kksdf cksdf");
		al.add("ajsda;sdasd");
		al.add(";dc;dsadc");
		
		List<String> items = removeDuplicate(al);
		
		for(String item : items) {
			System.out.println(item);
		}
	}
	public static List<String> removeDuplicate(List<String> list){
		List<String> result = new ArrayList<>();
		
		for(String str : list) {
			boolean[] b = new boolean[256];
			StringBuilder sb = new StringBuilder();
			
			for(char c:str.toCharArray()) {
				if(!b[c] && c!=' ' && Character.isLetter(c)) {
					sb.append(c);
					b[c]=true;
				}
			}
			result.add(sb.toString());
		}
		return result;
	}
}
