package pkg1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test10 {
	public static void main(String[] args) {
		String[] str = { "apple", "apple", "banana", "cabbage", "dalimb", "ernad", "banana", "ernad" };
		List<String> list = Arrays.asList(str);
		Set<String> dup = list.stream().filter(e -> Collections.frequency(list, e) > 1).collect(Collectors.toSet());
		System.out.println(dup);
		
		Set<String> setlist = new HashSet<String>();
		
		Set<String> dupe = list.stream().filter(e-> !setlist.add(e)).collect(Collectors.toSet());
		System.out.println(dupe);
	}
}
