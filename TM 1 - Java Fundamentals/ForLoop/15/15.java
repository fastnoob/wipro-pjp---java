import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("I/P : ");
		int number = sc.nextInt();
		int sumDigits = 0;
		int temp=number;
		int remainder;
		while(temp>0) {
			remainder=temp%10;
			sumDigits+=remainder;
			temp=temp/10;
		}
		System.out.println("O/P : "+sumDigits);

	}
}