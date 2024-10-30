package Program2;

import java.util.Arrays;
import java.util.List;

public class Program1 {

	static int counters ; 

	public static void increment()
	{
		counters++ ;
		System.out.println("counter count " +counters);
	}
	public static void main(String[] args) {
		
	List<Integer> array = Arrays.asList(10,20,30,20,40,30,40) ;
	Object[] arr =  array.toArray();

	array.stream().distinct().forEach(x->System.out.println(x));
	System.out.println("-----------");
	int size = arr.length;
	
	for(int i = 0; i<=size-1;i++)
	{
		for(int j =i+1;j<=size-1;j++)
		if(arr[i].equals(arr[j]))
		{
			System.out.println("Duplicate");
		}
		else
		{
			System.out.println(arr[i]);
		}
	}
	
	System.out.println("-----------");
	fibonacci(10);
	increment();
	increment();
	}

	static void fibonacci(int n )
	{
	int a=0,b=1,c ;
		
	if(n<=1)
	{
		System.out.println(a +" ");
	}
	if(n<=2)
	{
		System.out.println(b +" ");
	}
	for(int i=2;i<=n;i++)
	{
		c=a+b ;
		System.out.println(c+" ");
		a=b;
		b=c;
	}
	}
	
	}

