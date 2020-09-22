import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Box> s = new TreeSet<>();
        System.out.println("Enter the number of Box");
        int n = sc.nextInt();
        for (int i=0;i<n;i++) {
            Box box = new Box();
            System.out.println("Enter the Box " + (i+1) + " details");
            System.out.println("Enter Length");
            box.setLength(sc.nextDouble());
            System.out.println("Enter Width");
            box.setWidth(sc.nextDouble());
            System.out.println("Enter Height");
            box.setHeight(sc.nextDouble());
            s.add(box);
        }
        System.out.println("Unique Boxes in the Set are");
        for (Box box : s)
            System.out.println(box);
        sc.close();
    }

}