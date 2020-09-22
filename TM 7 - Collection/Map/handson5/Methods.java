import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

class Methods {
	private TreeMap<String, String> M1;
	
	public Methods() {
		M1 = new TreeMap<String, String>();
	}
	
	public TreeMap<String, String> saveCountryCapital(String countryName, String capital) {
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
	
	public TreeMap<String, String> swapKyeValue() {
		TreeMap<String, String> M2 = new TreeMap<String, String>();
		
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
