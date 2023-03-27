package Java_Module1;
import java.util.Scanner;
public class Find_Greatest_Num {

	public static void main(String[] args) {
		// Write a Java program to Take three numbers from the user and print the 
		//greatest number.
		
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a ");
		a = sc.nextInt();
		
		System.out.println("enter b ");
		b = sc.nextInt();
		
		System.out.println("enter c ");
		c = sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println(a + " a is greater ");
		}
		else if(b>a && b>c) {
			System.out.println(b + " b is greater ");
		}
		else 
		{
			System.out.println(c + " c is greater ");
		}
		
	}

}
