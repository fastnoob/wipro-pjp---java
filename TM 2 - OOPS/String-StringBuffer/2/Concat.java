import java.util.Scanner;

class Concat {

    public static void  main (String args[]) {
        Scanner in = new Scanner(System.in);
        String str1 = "", str2 = "";
        System.out.print("String 1 = ");
        str1 = in.nextLine();
        System.out.print("String 2 = ");
        str2 = in.nextLine();
        System.out.println(appendThemTogether(str1, str2));
    }
    static String appendThemTogether(String a, String b) {
        String str = "";
        if (a.charAt(a.length()-1) == b.charAt(0)) {
            str = a.substring(0, a.length()-2) + b;
        }
        else {
            str = a + " " + b;
        }
        str.toLowerCase();
        return str;
    }
}