package basic;
import java.util.Scanner;
public class Strings {

	public static void main(String[] args) {
		String name = new String( "string");
		 name = "umesh";
		System.out.print("the name is : ");
		System.out.println(name);
		int a=6;
		float b= 5.6544f;
		System.out.printf("the value of a is %d and the value of b is %8.2f\n",a,b);
		
		System.out.format("the value of a is %d and the value of b is %f\n",a,b);
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name ");
//		String str = sc.next(); 
		String str1 = sc.nextLine();
		System.out.println(str1);
		
	}

}
