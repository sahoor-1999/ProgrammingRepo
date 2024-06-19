package pkg1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test14 {
	public static void main(String args[]) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		
		List <String> result = myList.stream().map(e-> e+"").filter(e-> e.endsWith("5")).collect(Collectors.toList());
		
		System.out.println(result);
	}
}
