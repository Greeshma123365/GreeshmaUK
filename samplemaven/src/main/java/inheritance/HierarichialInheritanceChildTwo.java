package inheritance;

public class HierarichialInheritanceChildTwo extends HierarichialInheritanceParent {

	public void list()
	{
		System.out.println("Im hierarchial - Child2");
	}
	public static void main(String[] args) {

		HierarichialInheritanceChildTwo obj = new HierarichialInheritanceChildTwo();
		obj.list();
		print();
	}


}
