package Java_Module1;

import java.util.Scanner;

public class patter_rightTriangle_increase1 {

	public static void main(String[] args) {
//		Write a program in Java to make such a pattern like right angle triangle with 
//		number increased by 1 The pattern like: 
//		1 
//		2 3 
//		4 5 6 
//		7 8 9 10
		
		int i,j,n,k=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of rows");
		n = sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			
				System.out.print(k++ +" ");
				System.out.println("");
			
		}
		

	}

}
