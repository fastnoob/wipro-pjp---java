import java.util.Iterator;
import java.util.TreeSet;

//(b) Iterating the elemnts of the treeset
class OperationB {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Shayan");
        set.add("Prasanta");
        set.add("Supratim");
        set.add("Tanmoy");

        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
