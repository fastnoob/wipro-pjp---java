import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Handson2 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("Tripura", "Agartala");
        map.put("West Bengal", "Kolkata");
        map.put("Sikkim", "Gangtok");

        //checking the existence of a key
        Set<Entry<String, String>> s = map.entrySet();
        Iterator<Entry<String, String>> i = s.iterator();
        while (i.hasNext()) {
            Map.Entry<String, String> m = i.next();

            if (m.getKey().equals("West Bengal")) {
                System.out.println("Key West Bengal exists");
                break;
            }
        }
        //checking the existence of a value
        s = map.entrySet();
        i = s.iterator();
        while (i.hasNext()) {
            Map.Entry<String, String> m = i.next();
            if (m.getValue().equals("Gangtok")) {
                System.out.println("Value Gangtok exists");
                break;
            }
        }
        //Iterator to loop through the map key
        s = map.entrySet();
        i = s.iterator();

        while (i.hasNext()) {
            Map.Entry<String, String> m = i.next();
            System.out.println(m);
        }
    }

}