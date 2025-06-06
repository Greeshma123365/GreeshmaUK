package interfaceExample;

public class MultipleChild implements multiple1,multiple2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MultipleChild obj = new MultipleChild();
         obj.meth1();
         obj.meth2();
	}
public void meth2()
{
	System.out.println("Method2");
}
public void meth1()
{
	System.out.println("Method1");
}

}
