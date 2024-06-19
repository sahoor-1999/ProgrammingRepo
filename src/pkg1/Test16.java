package pkg1;

import java.util.Arrays;
import java.util.List;

public class Test16 {
	public static void main(String[] args) {
		List<Integer> ll = Arrays.asList(1, 3, 4, 5, 6, 23, 3, 4, 5, 65, 6);
		
		long count = ll.stream().count();
		System.out.println(count);
	}
}
