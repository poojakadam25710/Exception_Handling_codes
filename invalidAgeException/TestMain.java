/**
 * 
 */
package invalidAgeException;

import java.util.Scanner;

/**
 * 
 */
public class TestMain {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the age");
		int age=sc.nextInt();
		
		try {
			ValidateAge.ageValidator(age);
		}
		catch(InvalidAgeException e){
			System.out.println(e.getMessage());
		}
		sc.close();	
	}
}
