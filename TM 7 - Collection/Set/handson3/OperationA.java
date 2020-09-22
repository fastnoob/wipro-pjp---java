import java.util.*;

//(a) Reversing the elements of collection
class OperationA {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Shayan");
        set.add("Supratim");
        set.add("Prasanta");
        set.add("Tanmoy");
        Iterator<String> i1 = set.iterator();

        System.out.println("--------");
        System.out.println("ORIGINAL");
        System.out.println("--------");

            while(i1.hasNext()){
                System.out.println(i1.next());
            }

        Iterator<String> i2 = set.descendingIterator();

        System.out.println("--------");
        System.out.println("REVERSED");
        System.out.println("--------");

            while (i2.hasNext()) {
                System.out.println(i2.next());
            }
        }

}
