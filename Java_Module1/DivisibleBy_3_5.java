package Java_Module1;

public class DivisibleBy_3_5 {
			public static void main(String[] args) {
				
//	Write a Java program to print numbers between 1 to 100 which are divisible
//	by 3, 5 and by both. 
				
				
				System.out.println("divisible by 3");
				for(int i=1; i<=100;i++) {
					if(i%3==0) {
						System.out.print(i+", ");
					}
				}
				System.out.printf("\n");
				System.out.println("divisible by 5");
				for(int i=1; i<=100;i++) {
					if(i%5==0) {
						System.out.print(i+", ");
					}
				}
				System.out.printf("\n");
				System.out.println("divisible by 3 and 5");
				for(int i=1; i<=100;i++) {
					if(i%3==0 && i%5==0) {
						System.out.print(i+", ");
					}
				}
				
				
				
			}
}
