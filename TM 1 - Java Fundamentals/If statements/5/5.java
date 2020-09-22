import java.util.*;

class Main {
    public static void check(char k) {
            if( (k>=65&&k<=90) || (k>=97&&k<=122)) {
                System.out.println("O/P : Alphabet");
            }
            else if(k>=48 && k<=57) {
                System.out.println("O/P : Digit");
            }
            else {
                System.out.println("O/P : Special Character");
            }
    }
    public static void main(String args[])
    {
        Scanner t = new Scanner(System.in);
        System.out.print("I/P : ");
        char k = t.next().trim().charAt(0);
        check(k);
    }
}