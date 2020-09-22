class Main {
    public static void main(String args[]) {
        int number;
        int n = 0;
        int remainder;
        int reversedNumber=0;
        
if(args.length>0) {
        number = Integer.parseInt(args[0]);
        int temp=number;
        while(temp!=0){
            remainder=temp%10;
            reversedNumber=reversedNumber*10+remainder;
            temp=temp/10;
        }
        if(number==reversedNumber) {
        System.out.println(number+" is a palindrome");
    }
    else {
        System.out.println(number+" is not a palindrome");
    }
    }
else {
    System.out.println("Please enter an integer");
}
}
}
