import java.util.HashSet;
import java.util.Iterator;

class Country {
    HashSet<String> H1 = new HashSet<>();

    public HashSet<String> saveCountryNames(String CountryName) {
        H1.add(CountryName);
        return H1;
    }
    public String getCountry(String CountryName) {
        Iterator<String> it = H1.iterator();
        while (it.hasNext()) {
            if (it.next().equals(CountryName))
                return CountryName;
        }
        return null;
    }
}
class Handson1 {

    public static void main(String[] args) {
        Country countries = new Country();
        countries.saveCountryNames("Srilanka");
        countries.saveCountryNames("India");
        countries.saveCountryNames("Pakistan");

        System.out.println("India: " + countries.getCountry("India"));
        System.out.println("Italy: " + countries.getCountry("Italy"));
    }

}
