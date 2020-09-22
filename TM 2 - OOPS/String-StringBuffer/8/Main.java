import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.nextLine();
		int in=str.indexOf('*');
		System.out.println(str.substring(0, (in-1)) + str.substring(in+2));
	}
}