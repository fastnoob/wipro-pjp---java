import java.util.Scanner;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first character : ");
        char char1 = sc.next().charAt(0);
        System.out.print("Enter second character : ");
        char char2 = sc.next().charAt(0);        
        if (char1>char2)
            System.out.println(char2+" , "+char1);
       
        else
            System.out.println(char1+" , "+char2);
    }
    }