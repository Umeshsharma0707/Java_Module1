package basic;

import java.util.Scanner;
import java.util.scanner;

public class SwitchCase {

	public static void main(String[] args) {
		 int age;
		 System.out.println("if else ladder...");
		 System.out.println("enter age");
		 Scanner sc = new Scanner(System.in);
		 age = sc.nextInt();
		System.out.println("Swith Case ....");
		
		switch(age) {
		
		case 18 : 
			System.out.println("you are teenager !!");
			break ;
		case 23 : 
			System.out.println("you are going to join job");
			break;
		case 65 : 
			System.out.println("you are getting old");
			break;
		default : 
			System.out.println("enjoy your life");
		}
		System.out.println("thanks for using java");
		
//		 
//		if(age>56)
//		{
//			System.out.println("you are experinced");
//		}
//		else if(age > 46)
//		{
//			System.out.println("you are semi experienced");
//		}
//		else if(age > 35)
//		{
//			System.out.println("you are semi-semi experienced ");
//		}
//		else 
//		{
//			System.out.println("yor are not experienced");
//		}
		
		
		

	}

}
