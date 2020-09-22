
import java.util.*;

 class Handson3 {

    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("Tripura", "Agartala");
        properties.setProperty("West Bengal", "Kolkata");
        properties.setProperty("Sikkim", "Gangtok");
        Set<Map.Entry<Object, Object>> s = properties.entrySet();
        Iterator<Map.Entry<Object, Object>> i = s.iterator();
        while (i.hasNext()) {
            Map.Entry<Object, Object> m = i.next();
            System.out.println(m);
        }
    }

}
