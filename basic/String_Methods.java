package basic;
import java.util.Scanner;
public class String_Methods {

	public static void main(String[] args) {
		   System.out.println("String Methods in Java");
		   System.out.println("this is \"strings\" ");
		   
		   String a = "Umesh";
		   System.out.println(a);
		   String b = new String("Sharma");
		   String c = new String("  ji    ");
		   System.out.println(b);
		   System.out.println(a.length());  // to find length of String 
		   System.out.println(a.toLowerCase()); // to return value in LowerCase
		   System.out.println(b.toUpperCase());	// to return value in UpperCase
		   System.out.println(c.trim());		// to remove the space before or ater the string value 
		   
		   System.out.print("enter name:");
		   Scanner name = new Scanner(System.in);
		   String n = name.nextLine();    //string with user input
		   System.out.println("your name is :" + n.trim().toUpperCase());
		   
		   System.out.println("sub string from short to end: "+n.substring(2));
		   System.out.println("sub string from short to end not excluded: "+n.substring(2,3));
		   System.out.println(n.replace('r', 'p'));    // replace the char from 'r' to 'p'
		   System.out.println(a.replace("Um","mah"));	// replace the char from 'um' to 'mah'
		   
		   System.out.println(a.startsWith("Ume"));   //returns true if value starts with "Ume"
		   System.out.println(a.endsWith("d"));		  // returns true if value ends with "d"
		   
		   System.out.println(a.charAt(2));	  		  // names at char index 2
		   
		   System.out.println(a.indexOf('e'));       // give index value 
		   System.out.println(a.indexOf("s", 2));	// give index value but starts with 2
		   
		   System.out.println(a.lastIndexOf('e'));  
		   System.out.println(a.lastIndexOf('s', 3));  // give index of 's' from first 3
		   
		   System.out.println(a.equals("umesh"));     // give true or false if the string is same or not
		   System.out.println(a.equalsIgnoreCase("umesh"));
		   
		   
		   
	}

}
