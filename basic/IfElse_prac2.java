package basic;

import java.util.Scanner;

public class IfElse_prac2 {
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				double income, tax= 0;
				
				System.out.println("enter income : ");
				income = sc.nextDouble();
				
				if( income <= 250000)
				{
					tax = 0;
				}
				else if (income <= 500000 )
				{
					tax = (income - 250000)* 0.05;
					
				}
				else if (income > 500000 && income <= 1000000) {
					tax =  (income - 500000)* 0.2;
				}
				else if ( income > 1000000) {
					tax = (income - 1000000)* 0.3;
				}
				
				System.out.println("Income tax : " + tax);
				 
				
			}
}
