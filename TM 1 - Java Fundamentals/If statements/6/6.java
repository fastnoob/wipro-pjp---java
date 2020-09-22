import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner k = new Scanner(System.in);
        System.out.print("GENDER : ");
        String gender = k.nextLine();
        System.out.print("AGE : ");
        int age = k.nextInt();

        if(gender.equals("Male")) {
            if(age >=1 && age <= 58) {
                System.out.println("O/P : 8.4%");
            }
            else if(age >=59 && age <= 100) {
                System.out.println("O/P : 10.5%");
            }
        }

        else if(gender.equals("Female")) {
            if(age >=1 && age <= 58) {
                System.out.println("O/P : 8.2%");
            }
            else if(age >=59 && age <= 100) {
                System.out.println("O/P : 9.2%");
            }
        }
    }
}