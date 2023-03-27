package Java_Module1;
import java.util.Scanner;
public class Integer_computeValue {
	
	public static void main(String[] args) {
		
		//Write a Java program that accepts an integer (n) and computes the value of
		//	n+nn+nnn. Input number: 5
		//	5 + 55 + 555 
		
			int n;
			Scanner sc = new Scanner(System.in);
			System.out.println("enter number");
			n = sc.nextInt();
			
			System.out.printf("%d + %d%d + %d%d%d",n,n,n,n,n,n);
	
	}
}
