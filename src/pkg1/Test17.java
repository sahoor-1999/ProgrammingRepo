package pkg1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test17 {
public static void main(String[] args) {
	List<Integer> ll = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	
	Optional<Integer> op = ll.stream().max(Integer :: compare );
	
	System.out.println(op.get());
}
}
