import java.util.Scanner;

class Main{
    public static void main(String args[]) {
        int n,k;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the capacity : ");
        n=sc.nextInt();
        int [] num = new int[n];
        System.out.println("Enter the integers below : ");
        for(k=0;k<n;k++) {
            num[k]=sc.nextInt();
        }
         int sum = 0,d=0;    
         for(int i=0;i<num.length-1;i++){
             if(num[i]==6){
                 for(int j=num.length-1;j>=0;j--){
                     if(num[j]==7)
                     break;
                     d=d+num[j];
                 }
                 break;
              }
             sum=sum+num[i];
          }
 System.out.println("O/P : " + (d+sum)); 
    }
}



