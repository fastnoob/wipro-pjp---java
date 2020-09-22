import java.util.Scanner;

class Palindrome {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str = "";
        System.out.print("Enter string : ");
        str = in.nextLine();
        if(isPalindrome(str))
            System.out.print("PALINDROME");
        else
            System.out.print("NOT PALINDROME");
    }
    static boolean isPalindrome(String str){
        int length = str.length();
        for(int i=0;i<length/2;i++) {
            if (str.charAt(i)!=str.charAt(length-i-1))
                return false;
        }
        return true;
    }
}