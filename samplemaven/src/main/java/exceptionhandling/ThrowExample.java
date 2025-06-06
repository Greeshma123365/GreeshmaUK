package exceptionhandling;

public class ThrowExample {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     int a=10;
     if(a>18)
     {
    	 System.out.println("Eligible for voting");
     }
     else 
     {
    	 throw new ArithmeticException("age under 18");
     }
     }
	}


