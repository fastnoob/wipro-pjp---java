import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

class ContactList {
	HashMap<String, Integer> contacts = new HashMap<>();
	
	public void addContact(String name, Integer number) {
		contacts.put(name, number);
	}
	
	public void removeContact(String name) {
		contacts.remove(name);
	}

	@Override
	public String toString() {
		return "ContactList [contacts=" + contacts + "]";
	}
	
	public boolean doesKeyExist(String name) {
		Set<Entry<String, Integer>> s = contacts.entrySet();
		Iterator<Entry<String, Integer>> i = s.iterator();
		
		while (i.hasNext()) {
			Entry<String, Integer> me = i.next();
			if (me.getKey().equals(name)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean doesValueExist(Integer number) {
		Set<Entry<String, Integer>> s = contacts.entrySet();
		Iterator<Entry<String, Integer>> i = s.iterator();
		
		while (i.hasNext()) {
			Entry<String, Integer> m = i.next();
			if (m.getValue().intValue() == number) {
				return true;
			}
		}
		return false;
	}
	
	public void listAllContacts() {
		Set<Entry<String, Integer>> s = contacts.entrySet();
		Iterator<Entry<String, Integer>> i = s.iterator();
		
		while (i.hasNext()) {
			Entry<String, Integer> m = i.next();
			System.out.println(m);
		}
	}
}
