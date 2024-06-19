package pkg1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test11 {
public static void main(String[] args) {

	List<Integer> intList = Arrays.asList(1,4,19,8,7,56,19,101,1,5,2,1,4,5,7,5,3,6,8,9,4,1,2,4,3);
	
	Set<Integer> result = intList.stream().filter(e-> Collections.frequency(intList, e)>1).collect(Collectors.toSet());
	System.out.println(result);
	
	
	Set<Integer> duplicate = new HashSet<>();
	
	Set<Integer> duplicateRes = intList.stream().filter(e-> !duplicate.add(e)).collect(Collectors.toSet());
	
	System.out.println(duplicateRes);
}
}
