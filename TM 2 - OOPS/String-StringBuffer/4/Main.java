import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = in.nextLine();
         
        int length = str.length();
        if((length & 1)==1){
            System.out.println("null");
           }
        else {
          	System.out.println(str.substring(0, length/2));
        }
}
}