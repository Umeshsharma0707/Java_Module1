package basic;
import java.util.Scanner;
public class SwitchCase_prac {

	public static void main(String[] args) {
		// write a program to show days name 
		int day;
		System.out.println("Enter day ");
		Scanner sc = new Scanner(System.in);
		
		day = sc.nextInt();
		
		switch(day) {
		case 1 : 
			System.out.println("Sunday");
		break;
		case 2 : 
			System.out.println("Monday");
		break;
		case 3 : 
			System.out.println("Tuesday");
		break;
		case 4 : 
			System.out.println("Wednesday");
		break;
		case 5 : 
			System.out.println("Thursday");
		break;
		case 6 : 
			System.out.println("Friday");
		break;
		case 7 : 
			System.out.println("Saturday");
		break;
		default : 
			System.out.println("wrong input");
		break;
		}
		System.out.println("over");
		
		// nested and ladder if else
		if(day<=7)
		{
			if(day==1)
			{
				System.out.println("Sunday");
			}
			else if(day==2)
			{
				System.out.println("monday");
			}
			else if(day==3)
			{
				System.out.println("tuesday");
			}
			else if(day==4)
			{
				System.out.println("wednesday");
			}
			else if(day==5)
			{
				System.out.println("thursday");
			}
			else if(day==6)
			{
				System.out.println("friday");
			}
			else if(day==7)
			{
				System.out.println("saturday");
			}
		}
		

	}

}
