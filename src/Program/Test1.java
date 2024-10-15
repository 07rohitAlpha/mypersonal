package Program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.lang.String;
public class Test1 {

	public static void main(String[] args) {
		
		
		  List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  // print the list
		  System.out.println(list_Strings);
		  
		// Now insert a color at the first and last position of the list
		  list_Strings.add(1, "Pink");
		 // list_Strings.add(0, "Pink");
		  list_Strings.add(5, "Yellow");
		  // Print the list
		  System.out.println(list_Strings);
		
		  // retrieve the element
		   String Element = list_Strings.get(1);
		   System.out.println("Retrieve the element :" + Element);
		   
		 // Update the element 
		   
		   list_Strings.set(2, "Yellow");
		   System.out.println("Update the element :" + list_Strings);
		   
		// Remove the Element 
		   list_Strings.remove(2);
		   System.out.println("After remove the element :"+ list_Strings);
		   
		// Search the element
		   
		   if (list_Strings.contains("White")) {
			   
			   System.out.println("Find the Element :" );
		   }
			   else   { 
			  System.out.println("there is no such Element :"  );
			   }
	
		   // Sort the Element 
		   System.out.println("before the sort :" + list_Strings);	
		   Collections.sort(list_Strings);
		   System.out.println("After the sort Element :" + list_Strings);
		   
		   // shuffle the Element 
		   System.out.println("before the shuffle : "+ list_Strings);
		   Collections.shuffle(list_Strings);
		   System.out.println("After the shuffle: "+ list_Strings);
		   
		   
		   ArrayList<String> ary = new ArrayList<String>();
		   ary.add("Green");
		   ary.add("White");
		   ary.add("Red");
		   ary.add("Blue");
		   ary.add("Orange");
		   ary.add("Black");
		 
		   
		   
		  // Comparison the output ArrayList<Strings>
		   
//		   ArrayList<String> str = new ArrayList<String>();
//		   for(String e :list_Strings)
//			   str.add(ary.contains(e) ? "Yes"  : "No");
//		     System.out.println(str);		   
		   
		   
		   
		   
		  // Add the two ArrayList   
		     
//		     ArrayList <String> c1 = new ArrayList<String>();
//		     c1.addAll(list_Strings);
//		     c1.addAll(ary);
//		     System.out.println("Add two Array :" + c1);
//		   
   }   
	}

