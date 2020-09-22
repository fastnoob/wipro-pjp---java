import java.util.*;

class Handson2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeDB empDb = new EmployeeDB();
		
		Employee employee1 = new Employee(1, "Shayan Saha", "shayansaha.work@gmail.com", 'M', 15000);
		Employee employee2 = new Employee(2, "Irin Banik", "irinbanik@gmail.com", 'F', 11000);
		Employee employee3 = new Employee(3, "Subhra Singhat", "singhat.subhra89@rediffmail.com", 'F', 10000);
		Employee employee4 = new Employee(4, "Gaurav Mog", "gaurav_mog72@yahoo.in", 'M', 36000);
		
		empDb.addEmployee(employee1);
		empDb.addEmployee(employee2);
		empDb.addEmployee(employee3);
		empDb.addEmployee(employee4);


		for (Employee emp : empDb.listAll())
			System.out.println(emp.GetEmployeeDetails());
		
		int employeeRemove = 4;
		System.out.println();
		empDb.deleteEmployee(employeeRemove);
		
		System.out.println("\nAfter removing the employee of employee id "+employeeRemove+"\n");
		for (Employee emp : empDb.listAll()){
		System.out.println(emp.GetEmployeeDetails());
		}
		
		int employeeEmployeePaySlip=1;
		System.out.println();
		System.out.println(empDb.showPaySlip(employeeEmployeePaySlip));
	}

}
