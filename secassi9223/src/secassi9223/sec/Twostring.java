package secassi9223.sec;

public class Twostring {
	public static void main(String []a)
	{
	String[] name = {"name", "Peter" , "Amy", "John" ,"Boyd","Cathy"};
	int[] values = {15, 9, 14, 10, 12};
	
	System.out.println("Name\tValue");
	
	for(int i = 0; i < name.length; i++) 
	
		System.out.println(name[i] + "\t" + values[i]);
	
	}
	
}
