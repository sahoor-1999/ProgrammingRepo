package pkg1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test13 {
	public static void main(String[] args) {
		List<Integer> ll = new ArrayList<>();
		
		ll.add(10);ll.add(14);ll.add(13);ll.add(41);ll.add(98);
		
		List<Integer> evenNum = ll.stream().filter(n-> n%2==0).collect(Collectors.toList());
		
		System.out.println("Even numbers are " + evenNum);
	}
}
