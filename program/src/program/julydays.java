package program;

enum july {

	instance ();
	
	String name;
	
	private july()
	{
		System.out.println("july day added");
	}
	
	public void show()
	{
		System.out.println(name);
	}
}

public class julydays
{
	public static void main(String[] args) {
		
		//july day1 = july.instance ;
		//day1.name = "july day 1 created" ;
		
		
		//july day2 = july.instance ;
		//day1.name = "july day2 created" ;
		//day1.show();
		//day2.show();
		
		Thread t1 = new Thread(()->{
			july day3 = july.instance ;
			day3.name = "day3 called";
			day3.show();
		});
		
		Thread t2 = new Thread(()->{
			july day4 = july.instance ;
			day4.name = "day4 called";
			day4.show();
		});
		
		t1.start();
		t2.start();
	}
}