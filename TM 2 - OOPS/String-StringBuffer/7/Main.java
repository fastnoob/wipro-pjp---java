import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = in.nextLine();


        int length = str.length();
        if (str.charAt(0) == 'x' && str.charAt(length-1) == 'x') {
            System.out.println(str.substring(1, length-1));
        }
        else if (str.charAt(0) == 'x'){
            System.out.println(str.substring(1));
        }
        else if(str.charAt(length-1) == 'x'){
            System.out.println(str.substring(0, length-1));
        }
        else {
            System.out.println(str);
        }
    }
}