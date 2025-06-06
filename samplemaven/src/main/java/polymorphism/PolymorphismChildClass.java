package polymorphism;

public class PolymorphismChildClass extends PolymorphismParentClass
{
public void display()
{
	super.display();
	System.out.println("Child class");
}
public static void main(String args[])
{
	PolymorphismChildClass obj=new PolymorphismChildClass();
obj.display();
}
}