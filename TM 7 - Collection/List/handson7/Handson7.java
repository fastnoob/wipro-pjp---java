import java.util.Iterator;
import java.util.Vector;

class Employee {
    private int id;
    private String name;
    private String address;
    private Double salary;

    public Employee(int id, String name, String address, Double salary) {
        super();
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return "ID(" + id + "), Name(" + name + "), Address(" + address + "), Salary(" + salary + ")";
    }
}
class Handson7 {
    public static void main(String[] args) {
        Vector<Employee> v = new Vector<>();

        v.add(new Employee(1, "Shayan Saha", "KamarPukur", 15000.0));
        v.add(new Employee(2, "Irin Banik", "Chandrapur", 10000.0));
        v.add(new Employee(3, "Supratim Sarkar", "Indranagar", 20000.0));
        v.add(new Employee(4, "Prasanta Debnath", "Dhaleswar", 17000.0));

        Iterator<Employee> i = v.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

}
