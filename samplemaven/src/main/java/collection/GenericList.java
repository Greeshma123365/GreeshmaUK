package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericList {

	public static void main(String[] args) {
		List <String> s = new ArrayList <String> ();
//add
		s.add("Green");
		s.add("Blue");
		s.add("Red");
        System.out.println(s);
//get
        System.out.println(s.get(2));
//set
        s.set(2,"Yellow");
        System.out.println(s);
//indexOf
        System.out.println(s.indexOf("Yellow"));
//lastIndexOf 
         System.out.println(s.lastIndexOf("Yellow"));
// remove
         s.remove("Yellow");
         System.out.println(s);
//contains
         System.out.println(s.contains("Yellow"));
//isEmpty
         System.out.println(s.isEmpty());
         
//size
         System.out.println(s.size());
         
         
         
         
	}

}
