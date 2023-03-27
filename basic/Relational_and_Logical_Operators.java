package basic;
import java.util.Scanner;

public class Relational_and_Logical_Operators {

	public static void main(String[] args) {
//		Scanner sc = new scanner(System.in);				
		System.out.println("for logical AND...");
		boolean a = true;
		boolean b = false;
		boolean c = true ;
		
		if(a && b && c)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("false");
		}
		
		System.out.println("for logical OR..");
		boolean a1 = true;
		boolean b1 = false;
		boolean c1 = true ;
		
		if(a1 || b1 || c1)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("false");
		}
		System.out.println("for logical NOT...");
		
		System.out.print("Not of a is ");
		System.out.println(!a);
		System.out.print("Not of a is ");
		System.out.println(!b);
	}

}








