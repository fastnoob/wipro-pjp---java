import java.util.Scanner;
import java.util.Arrays;

class Main {
	public static void main(String args[]) {
		int n;
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter capacity : ");
		n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter the values below : ");
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.print("\nTwo largest numbers : " + arr[n-1] +" and "+ arr[n-2]);
		System.out.print("\nTwo smallest numbers : " + arr[0] + " and " +arr[1]);
		}
	
}
	