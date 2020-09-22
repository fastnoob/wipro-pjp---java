import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer : ");
		int number = sc.nextInt();
		int temp = number;
		int count = 0;
		
		if(number>1) {
		for(int i=2;i<=temp;i++) {
			if(temp%i==0) {
				count++;
			}
		}
		if(count==1) {
			System.out.println(number + " is prime");
		}
		else {
			System.out.println(number + " is not prime");
			}
		}

		else if(number<1) {
			System.out.println("Invalid number for checking prime or not");
		}

		else if(number==1) {
			System.out.println("1 is neither prime nor composite");
		}

	}
}