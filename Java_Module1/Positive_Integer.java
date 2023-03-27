package Java_Module1;
import java.util.Scanner;
public class Positive_Integer {

	public static void main(String[] args) {
		//• Write a Java program that reads a positive integer and count the number of 
		//		digits the number.
		
		Scanner sc = new Scanner(System.in);
		long n;
		long digits=0;
		System.out.println("enter a number less than 10 billion");
		n = sc.nextLong();
		
		if(n>=0) {
			if(n>=0 && n<10) {
				digits=1;
			}else if(n>=10 && n<100) {
				digits= 2;
			}else if(n>=100 && n<1000) {
				digits= 3;
			}else if(n>=1000 && n<10000) {
				digits= 4;
			}else if(n>=10000 && n<100000) {
				digits= 5;
			}else if(n>=100000 && n<1000000) {
				digits= 6;
			}else if(n>=1000000 && n<10000000) {
				digits= 7;
			}else if(n>=10000000 && n<100000000) {
				digits= 8;
			}else if(n>=100000000 && n<1000000000) {
				digits= 9;
			}else if(n>=1000000000 && n<10000000000L) {
				digits= 10;
			}else if(n>10000000000L){
				System.out.println("number is greater than 100,000,000,00");
			}
			System.out.println("entered number digits is: "+digits);
		}
		else {
			System.out.println("number is negative");
		}
		
		
		
	}
	
}
