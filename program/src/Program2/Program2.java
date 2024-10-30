package Program2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Program2 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,14,13,11,12,30,24,30,25,14,12) ;
		
		Map<Integer, Long> duplicate = list.stream().collect(Collectors.groupingBy(n->n,Collectors.counting()));
		
		duplicate.entrySet().stream().filter(e->e.getValue()>1).forEach(x->System.out.println(x));
	
		A a = new A() ;
		
		a.m1(null);
	}
	
	
}
class A
{
	void m1 (Object o)
	{
		System.out.println("object");
	}
	void m1 (Integer o)
	{
		System.out.println("Integer");
	}
}