package pkg1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Test9 {
	public static void main(String[] args) {
		String[] str = { "a", "a", "b", "c", "d", "e", "b", "e" };
		List<String> list = Arrays.asList(str);
		// Approach - 1
		List<String> duplicate = list.stream().collect(Collectors.groupingBy(s-> s, Collectors.counting()))
		.entrySet()
		.stream()
		.filter(entry -> entry.getValue() > 1)
		.map(Map.Entry::getKey)
		.collect(Collectors.toList());
		
		System.out.println(duplicate);
		
		// Approach -2 
		Set<String> setValue = new HashSet<>();
		
		Set<String> dup = list.stream().filter(e-> !setValue.add(e)).collect(Collectors.toSet());
		System.out.println(dup);
		
		// Approach -3
		Set<String> dupl = list.stream().filter(e-> Collections.frequency(list, e)>1).collect(Collectors.toSet());
		System.out.println(dupl);
	}
}
