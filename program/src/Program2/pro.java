package Program2;

public class pro {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =10 ;
		
		String bs = Integer.toBinaryString(n) ;
		System.out.println(bs);
		
		int count0s = count0s(bs) ;
		System.out.println(count0s);

	}

	private static int count0s(String bs) {
		int count = 0 ;
		for(char s : bs.toCharArray())
		{
			if(s == '0')
			{
				count++ ;
			}
		}
		return count ;
	}

}
