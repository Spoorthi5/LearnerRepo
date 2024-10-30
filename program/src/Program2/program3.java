package Program2;

import java.util.Arrays;
import java.util.List;

public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "program";
		int count = 0 ;
		for(char c : s.toCharArray())
		{
			count++ ;
		}
		
		//System.out.println(Length of the count);
		
		List<String> list = Arrays.asList("abc", "xyz", "abc") ;
		
		list.stream().distinct().forEach(x->System.out.println(x));
	}

}
