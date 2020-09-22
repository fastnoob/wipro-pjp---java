class Main {
    public static void main(String args[]) {
    int i,j;
    int arr[][] = new int[9][9];
    if(args.length<9) {
        System.out.println("Please enter 9 integer numbers");
    }
    if(args.length==9) {
        int k=0;
    for(i=0;i<3;i++) {
        for(j=0;j<3;j++) {
            
        arr[i][j]=Integer.parseInt(args[k]);
        k++;
            }
        }
    System.out.println("The given array is:");

    for(i=0;i<3;i++) {
        for(j=0;j<3;j++) {
                System.out.print(arr[i][j]+" ");
            }
        System.out.println();
    }


        int max=arr[0][0];
        for(i=0;i<3;i++)
        {
        for(j=0;j<3;j++)
        {
        if(arr[i][j]>max)
        max=arr[i][j];
        }
        }
        System.out.println("\nThe biggest number in the given array is " +max);
}
}
}