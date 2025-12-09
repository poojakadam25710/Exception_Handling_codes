/**
 * 
 */
package invalidAgeException;

/**
 * 
 */
public class ValidateAge {
	public static void ageValidator(int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("Age must be 18 or above");
		}
		
		System.out.println("You are eligible");		
	}
}
