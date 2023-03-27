package Java_Module1;
import java.util.Scanner;
public class ForLoop_sum {

	public static void main(String[] args) {
//		 Write a program in Java to input 5 numbers from keyboard and find their sum 
//		 and average using for loop. 
		
		Scanner sc = new Scanner(System.in);
		
		int input;
		int sum=0;
		int avg= 0;
		for(int i=1;i<=5;i++) {
			System.out.println("enter number"+i);
			input = sc.nextInt();
			sum = sum+input;
		}
		System.out.println("sum :"+sum);
		avg = sum/5;
		System.out.println("avg :"+avg);
		
		
	}

}
