package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Program5{

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws Exception {
		
	Stream<String> s = Stream.of("A","B","C","D") ;
	
	System.out.println(s.peek(System.out::print).findAny().orElse("na"));	
	}

}
class customException extends Exception{
	
	public customException(String msg) {
		int repo = 0 ;
		System.out.println("Using Repo" +repo);
}
}
