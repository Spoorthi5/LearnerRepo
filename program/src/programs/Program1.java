package programs;

public class Program1 {

	public static void main(String[] args) {
		
		/*
		 * int [] arr = {3,2,0,0,1,2,3,0,0,0,1,2,3,41,10} ; int temp = 0 ; int n = 0 ;
		 * 
		 * for(int i = 0 ; i<arr.length-1 ;i++) { if(arr[i]!=0) { arr[n] = arr[i] ; n++;
		 * } } for(int i=n ;i<arr.length ; i++) { arr[i]=0 ; } for(int i : arr) {
		 * System.out.println(i); }
		 */
	String[] strs = {"dog","doogmas","doll"} ;
	//strs = ["dog","racecar","car"]
	String prefix = strs[0] ;
	
	for(int i =1 ; i<strs.length;i++)
	{
		while(strs[i].indexOf(prefix)!=0)
		{
		prefix = prefix.substring(0,prefix.length()-1) ;
			if(prefix.isEmpty())
			{
				prefix =" " ;
			}
		}	 
	}
		System.out.println("Prefix: " +prefix);
	}
}
