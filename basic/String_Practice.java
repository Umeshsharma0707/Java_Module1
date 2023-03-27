package basic;
import java.util.Scanner;
public class String_Practice {

	public static void main(String[] args) {
		System.out.println("hello! this is practice set of \"Strings\"");
		
		// que.1 write a program to convert String to lowercase
		
		String Name = new String("UMESH");
		System.out.println(Name);
		Name = Name.toLowerCase();
		System.out.println("Converting String To lowercase: "+ Name);
		
		// que.2 write a program to replace spaces with underscores_
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String name = sc.nextLine();
	     System.out.println("your name is :"+ name);
	     name = name.trim().replace(' ','_').toUpperCase();
		
		// que.3 write a program to fill name in  letter template which looks like below
	    // "dear "name" thanks a lot"
	     
	     String letter = "Dear <|name|> Thanks a lot!";
	     System.out.println("enter your name");
	    
	     String lname = sc.next();
	     letter =  letter.replace("<|name|>",lname);
	     System.out.println(letter);
	
		//que.4  write a program to detect double and triple spaces in string
	     
	     String detect = "this string has     double and triple spaces";
	     System.out.println(detect.indexOf("  "));
	     
	     // que.5 write a program to format the following letter using escape sequence characters
	     
	     String letter2 = "Dear Umesh,\n \t This java course is nice. \nThanks a lot!";
	     System.out.println(letter2);
		
	}


	
}
