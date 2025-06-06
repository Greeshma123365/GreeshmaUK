package interfaceExample;

public class InterfaceClass implements Interface1
{public void display1()

	{
	System.out.println("Child Display");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
InterfaceClass obj = new InterfaceClass();
obj.display();
obj.print();
obj.display1();

Interface1 obj1 = new InterfaceClass();
obj1.display();
obj1.print();
	}
public void display() {
	System.out.println("display");
}
public void print() {
	System.out.println("Print");
}
}
