import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {
        String S1 = "JAVAJAVA";
        String S2 = "VA";
        List<String> list = doOperations(S1, S2);
        System.out.println("Output: " + list);
    }

    public static List<String> doOperations(String S1, String S2) {
        List<String> list = new ArrayList<String>();

        // OPERATION 1
        StringBuilder output = new StringBuilder();
        for (int i = 1; i < S1.length(); i += 2) {
            output.append(S2+S1.charAt(i));
        }
        list.add(output.toString());

        // OPERATION 2
        int count=S1.split(S2, -1).length - 1;
        if (count>1) {
            list.add(S1.substring(0, S1.lastIndexOf(S2)) + new StringBuilder(S2).reverse());
        }
        else {
            list.add(S1+S2);
        }

        // 3. OPERATION 3
        if (count > 1) {
            list.add(S1.substring(0, S1.indexOf(S2)) + S1.substring(S1.indexOf(S2)+S2.length(), S1.length()));
        }
        else{
            list.add(S1);
        }

        // OPERATION 4
         if(S2.length()%2==0){
             int midpoint=S2.length()/2;
             list.add(S2.substring(0,midpoint)+S1+S2.substring(midpoint,S2.length()));
       }
      else {
             int midpoint=S2.length()/2+1;
             list.add(S2.substring(0,midpoint)+S1+S2.substring(midpoint,S2.length()));
        }

        // OPERATION 5
        output = new StringBuilder();
        for (int i=0;i<S1.length();i++) {
            if (S2.indexOf(S1.charAt(i)) != -1) {
                output.append('*');
            } else {
                output.append(S1.charAt(i));
            }
        }
        list.add(output.toString());
        return list;
    }

}