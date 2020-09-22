import java.util.HashMap;
import java.util.TreeMap;

class Handson5 {
	public static void main(String[] args) {
		Methods methods = new Methods();

		methods.saveCountryCapital("India","Delhi");
		methods.saveCountryCapital("Japan","Tokyo");

		System.out.println(methods.getCapital("Japan"));
		System.out.println(methods.getCountry("Delhi"));
		System.out.println(methods.convert2ArrayList());
		
		TreeMap<String, String> M2 = methods.swapKyeValue();
		System.out.println(M2);
	}

}
