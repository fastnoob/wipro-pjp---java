import java.util.Iterator;
import java.util.TreeSet;

//(c) checking the existance of a string in the treeset

class OperationC {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Shayan");
        set.add("Prasanta");
        set.add("Supratim");
        set.add("Tanmoy");
        String find = "Shayan";
        Iterator<String> it = set.iterator();
        boolean isPresent = false;

        while (it.hasNext()) {
            if (it.next().equals(find)) {
                isPresent = true;
            }
        }
        if (isPresent) {
            System.out.println(find + " exists");
        }
        else {
            System.out.println(find + " doesn't exist");
        }
    }
}
