import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Methods {
	private Hashtable<String, String> M1;
	
	public Methods() {
		M1 = new Hashtable<String, String>();
	}
	public Hashtable<String, String> saveCountryCapital(String countryName, String capital) {
		M1.put(countryName, capital);
		return M1;
	}
	
	public String getCapital(String countryName) {
		return M1.get(countryName);
	}
	
	public String getCountry(String capitalName) {
		Set<Entry<String, String>> s = M1.entrySet();
		Iterator<Entry<String, String>> i = s.iterator();
		
		while (i.hasNext()) {
			Entry<String, String> m = i.next();

			if (m.getValue().equals(capitalName))
				return m.getKey();
		}
		return null;
	}
	
	public Hashtable<String, String> swapKyeValue() {
		Hashtable<String, String> M2 = new Hashtable<String, String>();
		
		Set<Entry<String, String>> s = M1.entrySet();
		Iterator<Entry<String, String>> i = s.iterator();
		
		while (i.hasNext()) {
			Entry<String, String> m = i.next();
			M2.put(m.getValue(), m.getKey());
		}
		return M2;
	}
	
	public ArrayList<String> convert2ArrayList() {
		ArrayList<String> list = new ArrayList<>();
		
		Set<Entry<String, String>> s = M1.entrySet();
		Iterator<Entry<String, String>> i = s.iterator();
		
		while (i.hasNext()) {
			Entry<String, String> m = i.next();
			list.add(m.getKey());
		}
		return list;
	}
}
