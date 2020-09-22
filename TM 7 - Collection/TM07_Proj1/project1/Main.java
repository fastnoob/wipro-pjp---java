import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int noOfEmployees = sc.nextInt();
        sc.nextLine();
        List<Employee> employeeDB = new ArrayList<>();
        for (int i = 0; i < noOfEmployees; i++) {
            System.out.println("Enter Employee " + (i+1) + " details");
            System.out.print("Enter the firstname : ");
            String firstName = sc.nextLine();
            System.out.print("Enter the lastname: ");
            String lastName = sc.nextLine();
            System.out.print("Enter the Mobile number : ");
            long mobileNumber = sc.nextLong();
            sc.nextLine();
            System.out.print("Enter the email: ");
            String emailId = sc.nextLine();
            System.out.print("Enter the address: ");
            String address = sc.nextLine();

            employeeDB.add(new Employee(firstName, lastName, mobileNumber, emailId, address));
        }

        Collections.sort(employeeDB);

        System.out.println("Employee List:");
        System.out.format("%-15s %-15s %-15s %-30s %-15s\n", "FirstName", "SecondName", "MobileNumber", "Email", "Address");
        System.out.println();
        Iterator<Employee> i = employeeDB.iterator();
        while (i.hasNext()) {
            Employee emp = i.next();
            System.out.format("%-15s %-15s %-15s %-30s %-15s\n",emp.getFirstName(),emp.getLastName(),emp.getMobileNumber(),emp.getEmailId(),emp.getAddress());
        }
    }

}