package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String> s = new HashSet <String> ();
		//add
				s.add("Green");
				s.add("Blue");
				s.add("Red");
				Set <String> a = new HashSet <String> ();	
				a.add("Apple");
				a.add("Grapes");
				a.add("Banana");
				s.addAll(a);
				System.out.println(s);
		        
		//contains
		         System.out.println(s.contains("Yellow"));
					System.out.println(a.containsAll(s));

		//isEmpty
		         System.out.println(s.isEmpty());

		// remove
		         s.remove("Green");
		         System.out.println(s);
		         s.removeAll(a);
		         System.out.println(s);
		//size
		         System.out.println(s.size());
		         
//		clear
		         a.clear();
		         System.out.println(a);
		
		
	}
}
