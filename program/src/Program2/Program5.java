package Program2;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Program5 {
	
 public static void main(String[] args) {
	
	String s = " abccfrenddpqrs" ;

	/*
	 * Integer len = s.length() ; int temp =0 ; String [] substr = new
	 * String[len*(len+1)/2] ;
	 * 
	 * for(int i = 0 ; i<len ;i++) { for(int j=i; j<len; j++) { String sub =
	 * s.substring(i,j+1); substr[temp] = sub ; temp++ ; } }
	 * 
	 * System.out.println();
	 */
	
	 List<Integer> list = Arrays.asList(1,6,7,8,2,9);
	 
	Integer secondmax = list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println(secondmax);
	 
		System.out.println("100" + "100" + "Hello Wordl" );   

		        System.out.println("Hello World" + 100 + 100) ; 
		        		 // helloworld20
		        
		        String strs = "GHJJUhdhjdiIKJH" ;
		        String str2 = strs.chars()
		        .map(c->Character.isLowerCase(c)?Character.toUpperCase(c):Character.isUpperCase(c)?Character.toLowerCase(c):c)
		        .mapToObj(c->String.valueOf((char)c))
		        .collect(Collectors.joining()) ;
		        System.out.println(str2);
}
}



 
