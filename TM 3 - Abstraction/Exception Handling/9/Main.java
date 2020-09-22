import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the 2 numbers");
			int a  = sc.nextInt();
			int b = sc.nextInt();
			int q = a/b;
			System.out.println("The quotient of " + a + "/" + b + " = " + q);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage() + " caught");
		} finally {
			System.out.println("Inside finally block");
		}
	}

}
