package exceptionhandling;

public class CustomException {

	public static void main(String[] args) throws VotingException
	{
		// TODO Auto-generated method stub
		int a=10;
	     if(a>18)
	     {
	    	 System.out.println("Eligible for voting");
	     }
	     else 
	     {
	    	 throw new VotingException("age under 18");
	     }
	     }
	}


