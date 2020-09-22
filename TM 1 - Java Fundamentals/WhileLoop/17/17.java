import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        int number;
        int n = 0;
        int remainder;
        int reversedNumber=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("I/P : ");
        number = sc.nextInt();
        int temp=number;
        while(temp!=0){
            remainder=temp%10;
            reversedNumber=reversedNumber*10+remainder;
            temp=temp/10;
        }
        System.out.println("O/P : " + reversedNumber);
    }
}