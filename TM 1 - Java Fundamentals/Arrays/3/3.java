import java.util.Scanner; 
class Main { 
  
    public static int indexVal(int arr[], int s) 
    {    
        int length = arr.length; 
        int i = 0;        
        while (i<length) {           
            if (arr[i]==s){ 
                return i; 
            } 
            else { 
                i++; 
            } 
        } 
        return -1; 
    } 
  
    public static void main(String[] args) 
    { 
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter capacity : ");
        n=sc.nextInt();
        int []nums=new int[n];
        System.out.println("Enter the integers below : ");
        for(i=0;i<n;i++) {
        		nums[i]=sc.nextInt();
        }
        System.out.print("Enter the search element : ");
        int searchEl = sc.nextInt();
 		System.out.println(indexVal(nums, searchEl)); 
    }

} 