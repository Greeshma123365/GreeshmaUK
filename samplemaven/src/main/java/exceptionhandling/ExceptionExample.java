package exceptionhandling;

public class ExceptionExample {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
    int a=10;
    int b=0;
    try 
    {
        int s=a/b;
    }
    catch(ArithmeticException e)
    {
    	b=3;
    	int d=a/b;
    	System.out.println(d);
    	System.out.println(e);
    }
    finally
    {
    	b=3;
    	int d=a/b;
    	System.out.println(d);
    }
	}

}
