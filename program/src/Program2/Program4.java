package Program2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program4 {

	public static void main(String[] args) {
	
		List<Integer> list = Arrays.asList(12,34,45,3,4,16,3,3);
		
		list.stream().filter(n->(n==3||n/10 ==3)).forEach(x->System.out.println(x));
		
		List<Integer> list2 = Arrays.asList(2,3,24,24,28,28,3,4,56);
		
		Integer map = list2.stream().collect(Collectors.groupingBy(n->n,Collectors.counting()))
				.entrySet().stream().filter(e-> e.getValue()>1).map(Map.Entry::getKey)
				.sorted(Collections.reverseOrder()).skip(1).findFirst().get() ;
	
		
		String firstString = "Naresh";
		String secondString = "Vijesh";
		
		StringBuilder common = new StringBuilder() ;
	//String common ="";	
	
		for(Character c1 : firstString.toCharArray())
		{
			for(Character c2 : secondString.toCharArray())
			{
				if(c1==c2)
					
				{
					common.append(c1);
				}
			}
		}
		
		System.out.println(common);
		
		List<String> chlist1 = Arrays.stream(firstString.split("")).collect(Collectors.toList());
		List<String> chlist2 = Arrays.stream(secondString.split("")).collect(Collectors.toList());
			//Collections.reverse(chlist2);
	chlist1.retainAll(chlist2) ;
	System.out.println("common:" +chlist1);
	}
// select salary from employee order by salary desc limit 1 offset 1 ; 
} 
