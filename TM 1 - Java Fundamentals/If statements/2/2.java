import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Interger : ");
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println(num + " is even");
		}
		else {
			System.out.println(num + " is odd");
		}
	}
}