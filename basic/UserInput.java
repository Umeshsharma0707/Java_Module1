package basic;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		System.out.println(" taking input from the user ");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter number 1");
		int num1 = scan.nextInt();
		
		System.out.println("Enter number 2");
		int num2 = scan.nextInt();
		
		int sum = num1 + num2;
		System.out.println("the sum of these is ");
		System.out.println(sum);
		
//		boolean age = scan.hasNextInt();
//		System.out.println(age);
		
		String str = scan.next();
		System.out.println(str);
		System.out.println("enter next string");
		String str2 = scan.nextLine();
		System.out.println(str2);
		
	}

}







