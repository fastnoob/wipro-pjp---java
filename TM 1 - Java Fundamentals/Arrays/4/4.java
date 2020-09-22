import java.util.Scanner;

class Main {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	int n=sc.nextInt();
    	int []nums=new int[n];
    	System.out.println("Enter the ASCII values below :");
    	int i;
    	for(i=0;i<n;i++) {
    		nums[i]=sc.nextInt();
    	}
        String str=null;
        for(int k: nums){
            str = Character.toString((char)k);
            System.out.print(str + " ");
        }
    }
}