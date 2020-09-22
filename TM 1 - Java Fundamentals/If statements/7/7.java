import java.util.Scanner;

class Main {
	static void CharacterTrans(char a) {
		char ua,la;
	if(Character.isUpperCase(a)) {
		la = Character.toLowerCase(a);
		System.out.print(la);
	}	
	else {
		ua = Character.toUpperCase(a);
		System.out.print(ua);
	}
}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Character : ");
		char ch = sc.next().charAt(0);
		CharacterTrans(ch);
	}
	
}