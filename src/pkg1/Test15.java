package pkg1;

import java.util.Arrays;
import java.util.List;

public class Test15 {
	public static void main(String args[]) {
		List<Integer> myList = Arrays.asList(98,10, 15, 8, 49, 25, 98, 32);
		
		myList.stream().findFirst().ifPresent(System.out::println);
		myList.stream().findAny().ifPresent(System.out::println);
	}
}
