import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(nCopyString(str));
    }

    static String nCopyString(String str) {
        int n = str.length();
        String b = str.substring(0, 2);

        str = "";

        for(int i=0; i<n; i++)
            str += b;
            
        return str;
    }
}