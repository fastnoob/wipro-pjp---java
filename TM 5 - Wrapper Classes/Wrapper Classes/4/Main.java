class Employee implements Cloneable {
	private String name;
	private String phone;
	private String emailid;
	
	public Employee(String name, String phone, String emailid) {
		this.name = name;
		this.phone = phone;
		this.emailid = emailid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getEmailid() {
		return emailid;
	}
	
	@Override
	public Employee clone() {
		try {
			return (Employee) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("CLONING DISRUPTED");
			return this;
		}		
	}
}

class Main {
	public static void main(String[] args) {
		Employee employee = new Employee("Shayan Saha","(+91) 1234567890", "shayansaha.work@gmail.com");
		Employee clonedEmployee = employee.clone();

		clonedEmployee.setName("Irin Banik");
		clonedEmployee.setPhone("(+91) 7894561230");
		clonedEmployee.setEmailid("irinbanik@gmail.com");

		System.out.print("\n--------\nORIGINAL\n--------\n"+
						 "Name : "+employee.getName()+"\n"+
						 "Phone Number : "+employee.getPhone()+"\n"+
						 "Email ID : "+employee.getEmailid()+"\n");
		System.out.print("\n-------\nCLONED\n-------\n"+
						 "Name : "+clonedEmployee.getName()+"\n"+
						 "Phone Number : "+clonedEmployee.getPhone()+"\n"+
						 "Email ID : "+clonedEmployee.getEmailid()+"\n");
	}

}
