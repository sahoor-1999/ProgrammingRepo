package pkg1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test12 {
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1443, 2, 1, 4, 5, 7, 5, 3, 6, 8, 9, 4, 1, 2,
				4, 3);
		Collections.reverse(intList);
		
		Set<Integer> uniqSet = new HashSet();
		List<Integer >uniqueList = intList.stream()
				.filter(uniqSet::add)
				.collect(Collectors.toList());
		System.out.println(uniqueList);
		
		Set<Integer> as = new HashSet<>();
		List<Integer >uniqueList2 = intList.stream().filter(as::add).collect(Collectors.toList());
		System.out.println(uniqueList2);
	}
}
