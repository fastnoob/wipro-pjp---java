import java.util.*;

class InvalidCountryException extends Exception {
	public InvalidCountryException() {
		super();
		System.out.println("InvalidCountryException occured");
		System.out.println("User Outside India  cannot be registered");
	}
}


class UserRegistration {
	
	public void registerUser(String username, String userCountry) throws InvalidCountryException {
		if (!userCountry.equals("india"))
			throw new InvalidCountryException();
		else
			System.out.println("User registration done successfully");
	}
	public static void main(String[] args) {
		UserRegistration registration = new UserRegistration();
		Scanner sc=new Scanner(System.in);
		String name="";
		String country="";
		System.out.print("Enter the name : ");
		name=sc.nextLine();
		System.out.print("Enter the country : ");
		country=sc.nextLine();
		try {
			registration.registerUser(name, country.toLowerCase());
		} catch (InvalidCountryException e) {
		}
	}

}
