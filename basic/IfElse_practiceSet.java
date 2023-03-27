package basic;
import java.util.Scanner;
public class IfElse_practiceSet {
		public static void main(String[] args) {
			float sub1;
			float sub2;
			float sub3;
			float sum;
			float per;
			System.out.println("enter your marks");
			Scanner sc = new Scanner(System.in);
			System.out.println("enter marks of Sub1: ");
			sub1 = sc.nextFloat();
			
			System.out.println("enter marks of Sub2: ");
			sub2 = sc.nextFloat();
			
			System.out.println("enter marks of Sub3: ");
			sub3 = sc.nextFloat();
			
			System.out.println("sub1 marks : "+ sub1);
			System.out.println("sub2 marks : "+ sub2);
			System.out.println("sub3 marks : "+ sub3);
			
			sum = sub1 + sub2 + sub3;
			per = (sum/300)*100;
			System.out.println("your total marks : " +sum+ " out of 300");
			System.out.println("percentage : "+ per );
			
			// switch case
			
			if(per > 35) {
				if(per > 90) {
					System.out.println("Grade :\" A+\"");
					System.out.println("Excellent ");
				}
				else if(per > 80) {
					System.out.println("Grade :\" A\"");
					System.out.println("very good");
				}
				else if(per > 70) {
					System.out.println("Grade :\" B++\"");
					System.out.println("good");
				}
				else if(per > 60) {
					System.out.println("Grade :\" B+\"");
					System.out.println("good study hard");
				}
				else if(per > 50) {
					System.out.println("Grade :\" B\"");
					System.out.println("average");
					
				}
				else if(per > 40) {
					System.out.println("Grade :\" c\"");
					System.out.println("study more");
				}
				else if(per >=36) {
					System.out.println("Grade :\" D\"");
					System.out.println("study hard");
				}
			}
			else {
				System.out.println("you are fail ");
				System.out.println("marks doesn't matter");
			}
			
		}
}









