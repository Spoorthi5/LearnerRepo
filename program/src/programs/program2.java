package programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class program2 {

	public static void main(String[] args) {
	
		
		String str = "big black bug bit a big black dog on his big black nose";
		
		Map<String,Long>    str1List = Arrays.stream(str.split(" "))
				.collect(Collectors.groupingBy(word->word,Collectors.counting()));
		List<String> list = str1List.entrySet().stream()
				.filter(e->e.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList()) ;
		
		System.out.println(list) ;

	}

}



/*
 * class book {
 * 
 * @autowired
 * 
 * @qualifier("non fictional") private genre ;
 * 
 * }
 * 
 * @qualifer (name ="fictfic") class fictonal implementing genre {
 * 
 * 
 * 
 * }
 * 
 * class non fictional implemnting genre
 * 
 * {
 * 
 * }
 * 
 * class histo
 */



