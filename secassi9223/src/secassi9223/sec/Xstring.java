package secassi9223.sec;

public class Xstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = doSomething();
	        System.out.println("Print the value from the function: " + s.length());
	        System.out.println(s.replaceFirst("1234", "XXXXX"));
	        System.out.println("Print the value from the function: " + s);
	        
	        
	}




    public static String doSomething() {
        return "12345678";
    }
}
