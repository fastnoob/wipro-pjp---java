import java.util.HashSet;
import java.util.Iterator;

class Handson2 {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Shayan Saha");
        set.add("Irin Banik");
        set.add("Supratim Sarkar");
        set.add("Prasanta Debnath");

        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}