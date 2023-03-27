package Java_Module1;
import java.util.Scanner;
public class Leap_year {

	public static void main(String[] args) {
	// Write a Java program that takes a year from user and print whether that year 
//		is a leap year or not
		long year;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a year ");
		year = sc.nextLong();
		
	if(year %4 ==0) {
		System.out.println(year+" is a leap year");
		if(year %100 ==0) {
			System.out.println(year+" is a leap year");
			if(year %400 ==0) {
				System.out.println(year+" is a leap year");
			}
		}
	}
	else {
		System.out.println(year+" is not a leap year");
	}

}
}