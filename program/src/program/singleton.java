package program;

public class singleton {

	public static void main(String[] args) {
		
	june day1 = june.getInstace();
	//System.out.println(day1);
		
	june day2 = june.getInstace() ;
	//System.out.println(day2);
	
	Thread t1 = new Thread(()->{	
		june day3 = june.getInstace();
		}) ;
	
	Thread t2 = new Thread (()->{
		june day4 = june.getInstace();
	});
	
	t1.start();
	t2.start();
	
	}

}

class june
{
	private june()
	{
		System.out.println("june day started");
	}
	
	static june obj;
	
	public static june getInstace()
	{
		if(obj==null)
		{
			synchronized (june.class) 
			{
				if(obj==null)
				{
					return obj = new june() ;
				}		
			}
		}
		return obj ;
	}
	// to prevent singelton class during deserialization
	
	protected Object readResolve()
	{
		return getInstace() ;
	}
	
}
