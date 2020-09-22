import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int n = in.nextInt();

        String r = str.substring(str.length()-n);
        String op_str = "";
        for(int i=0;i<n; i++) {
            op_str+=r;
        }
        System.out.println(op_str);
    }
}