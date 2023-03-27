package basic;

public class Practice_set {

	public static void main(String[] args) {
//		que1. what will be the result of a= (7/4)*(9/2);
		   float a= (7/4f)*(9/2f);
		   System.out.println(a);
		    
//		que2 a program to encrypt a grade by adding 8 to it, decrypt it to show the correct grade
		
			System.out.println("grade of student ");
			
			 char grade = 'B';
			
			grade= (char)(grade + 8);
			System.out.println("grade : "+ grade);
			
			//decrypt
			grade= (char)(grade - 8);
			System.out.println("grade : "+ grade); 
			

			
	}

}













