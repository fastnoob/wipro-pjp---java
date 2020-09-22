import java.util.*;

class Handson3 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Shayan");
		names.add("Subir");
		names.add("Mainak");
		names.add("Soumyaraj");
		names.add("Puspendu");
		
		printAll(names);
	}

	public static void printAll(List<String> names) {
		Iterator<String> i = names.iterator();
		
		while (i.hasNext())
			System.out.println(i.next());
	}
}