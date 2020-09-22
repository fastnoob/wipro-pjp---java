import java.util.*;

class Handson1 {
    public static void main(String[] args) {
        Methods methods = new Methods();
        methods.saveCountryCapital("India","Delhi");
        methods.saveCountryCapital("Japan","Tokyo");

        System.out.println(methods.getCapital("Japan"));
        System.out.println(methods.getCountry("Delhi"));
        System.out.println(methods.convert2ArrayList());

        HashMap<String,String> M2 = methods.changeKeyVal();
        System.out.println(M2);
    }
}
