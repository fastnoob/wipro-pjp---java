import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();

        int length1 = str1.length();
        int length2 = str2.length();

        if(length1 < length2){
        	System.out.println(str1+str2+str1);
        } else {
        	System.out.println(str2+str1+str2);
        }
    }
}