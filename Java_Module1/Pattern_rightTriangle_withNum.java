package Java_Module1;
import java.util.Scanner;
public class Pattern_rightTriangle_withNum {

	public static void main(String[] args) {
		
//		Write a program in Java to display the pattern like right angle triangle with a 
//		number. 
//		1 
//		12 
//		123 
//		1234 
//		1234
		
		int i,j,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of rows");
		n = sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			
				System.out.print(j);
				System.out.println("");
			
		}

	}

}
