import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the capacity of the array - ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		int i;

		System.out.println("Enter the values below : ");
		for(i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}

		int sum=0;
		for(i=0;i<n;i++) {
			sum+=arr[i];
		}
		double avg = (double)(sum/n);
		System.out.println(avg);
	}
}