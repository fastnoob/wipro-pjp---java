import java.util.Enumeration;
import java.util.Vector;

class Handson6 {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.addElement(new String("January"));
        v.addElement(new String("February"));
        v.addElement(new String("March"));
        v.addElement(new String("April"));
        v.addElement(new String("May"));
        v.addElement(new String("June"));
        v.addElement(new String("July"));
        v.addElement(new String("August"));
        v.addElement(new String("September"));
        v.addElement(new String("October"));
        v.addElement(new String("November"));
        v.addElement(new String("December"));


        Enumeration vEnum = v.elements();
        System.out.println("\nMONTHS IN THE VECTOR");
        System.out.println("--------------------");

        while (vEnum.hasMoreElements()) {
            System.out.println(vEnum.nextElement());
        }
    }
}