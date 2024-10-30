package programs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class program3 {

	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(1,2, 4, 3,5) ;

		int sum = 5 ;
		Optional<Integer> num =list.stream().reduce((a,b)->a+b==10?a+b:0);
		num.ifPresent(x->System.out.println(num));
		
		for(int i = 0 ; i<=list.size();i++)
			for(int j=i+1;j<list.size();j++)
		{
				int num1 = list.get(i);
				int num2 = list.get(j);
				if(num1+num2==sum)
			
				{
					System.out.println(num1+" "+num2);
				}
		}
		
	}

}
