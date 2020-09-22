import java.util.HashMap;
import java.util.Hashtable;

class Handson6 {

	public static void main(String[] args) {
		Methods methods = new Methods();
		methods.saveCountryCapital("India","Delhi");
		methods.saveCountryCapital("Japan","Tokyo");

		System.out.println(methods.getCapital("Japan"));
		System.out.println(methods.getCountry("Delhi"));
		System.out.println(methods.convert2ArrayList());
		
		Hashtable<String, String> M2 = methods.swapKyeValue();
		System.out.println(M2);
	}

}
