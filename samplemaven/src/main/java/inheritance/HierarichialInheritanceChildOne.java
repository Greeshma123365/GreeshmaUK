package inheritance;

public class HierarichialInheritanceChildOne extends HierarichialInheritanceParent
{
	public void show()
	{
		System.out.println("Im hierarchial - Child1");
	}
	public static void main(String[] args) {

		HierarichialInheritanceChildOne obj = new HierarichialInheritanceChildOne();
		obj.show();
		print();

	}

}
