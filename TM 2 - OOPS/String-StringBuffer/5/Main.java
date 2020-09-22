import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = in.nextLine();
        System.out.println(str.substring(1, str.length()-1));

}
}