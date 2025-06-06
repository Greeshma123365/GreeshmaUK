package aggregation;

public class AggregationChilad 
{
	String city; 
	String State; 
	AggregationParent ref; 
public AggregationChilad(String city, String state,AggregationParent ref) 
{
	this.city=city; 
	this.State=state; 
	this.ref=ref; 
} 
public void display() 
{
	System.out.println(ref.name+" "+ref.rollno); 
	System.out.println(city+" "+State); 
} 
public static void main(String args[]) 
{ 
	AggregationParent obj1=new AggregationParent("ammu", 10,"abcd"); 
	AggregationChilad obj=new AggregationChilad("TVm","Kerala",obj1); 
	obj.display(); }
	
}
