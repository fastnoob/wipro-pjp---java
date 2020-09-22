import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String ans = String.format("%8s", Integer.toBinaryString(n)).replace(' ', '0');
		System.out.println(ans);

	}

}
