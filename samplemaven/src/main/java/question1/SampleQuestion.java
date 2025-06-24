package question1;

public class SampleQuestion 
{
int a;
int b;
int s;
public SampleQuestion(int a,int b)
{
	s=a+b;
	System.out.println("Sum of two numbers is " +s);
}
public void display()
{
	int avg=s/2;
	System.out.println("Average of two numbers is " +avg);
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
SampleQuestion obj = new SampleQuestion(10,20);
obj.display();
	}

}
