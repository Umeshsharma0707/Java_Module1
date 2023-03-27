package basic;
import java.util.Scanner;
public class IF_elseCondition {

	public static void main(String[] args) {
		// if else condition statements
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age ");
		
		age = sc.nextInt();
	//	boolean cond = (age==18); 
		if(age>=18)
			
		{
			System.out.println("yes bro you can drive");
		}
		else {
			System.out.println("no bro you cannot drive yet!!");
		}
		
		boolean a = (age==18);
		
		
		System.out.println(a);
	}
	

}
