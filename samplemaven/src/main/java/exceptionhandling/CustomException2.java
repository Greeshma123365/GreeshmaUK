package exceptionhandling;

public class CustomException2 {

	public static void main(String[] args) throws AgeException {
		// TODO Auto-generated method stub
		int a=10;
	     if(a>18)
	     {
	    	 System.out.println("Eligible for voting");
	     }
	     else 
	     {
	    	 throw new AgeException("age under 18");
	     }
	}

}
