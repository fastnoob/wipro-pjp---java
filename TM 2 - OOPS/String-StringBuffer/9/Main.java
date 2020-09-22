import  java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("String 1 : ");
		String s1 = sc.nextLine();
		System.out.print("String 2 : ");
		String s2 = sc.nextLine();
		int i=0,j=0;
		while(i<s1.length() || j<s2.length()){
		System.out.print(s1.charAt(i));
		System.out.print(s2.charAt(j));
		i++;
		j++;
}
}
}