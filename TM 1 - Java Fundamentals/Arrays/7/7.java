import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
 
class Main {
    public static void main(String[] args) 
    {

        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the capacity : ");
        n=sc.nextInt();
        Integer [] nums = new Integer[n];
        System.out.println("Enter the array elements below : ");
        for(i=0;i<n;i++) {
            nums[i]=sc.nextInt();
        }
        System.out.println("\nI/P : " + Arrays.toString(nums));
         
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>( Arrays.asList(nums) );
         
    
        Integer[] newNums = linkedHashSet.toArray(new Integer[] {});
        System.out.println("O/P : " + Arrays.toString(newNums));
    }
}