package Java_Module1;
import java.util.Scanner;

public class Vowel_consonents {

	public static void main(String[] args) {
//		Write a Java program that takes the user to provide a single character from 
//		the alphabet. Print Vowel or Consonant, depending on the user input. If the 
//		user input is not a letter (between a & z or A and Z), or is a string of length 
//		> 1, print an error message
		
	String input;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter alphabet");
	input = sc.next();
	
	boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <=90;
	boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <=122;
	boolean vowel = input.equals("a") || input.equals("a") || input.equals("a") || input.equals("a") || input.equals("a");
	if(input.length() > 1) {
		System.out.println("error, not a single character ");
	} 
	else if(!(uppercase || lowercase)) {
		System.out.println("input is not a character");
	}
	else if(vowel) {
		System.out.println("input is vowel");
	} else {
		System.out.println("input is character");
	}
	
	
	
		
		

	
	
	
	

	}

}
