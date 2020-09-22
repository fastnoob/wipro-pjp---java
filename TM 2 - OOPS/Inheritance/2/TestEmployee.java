class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Shayan Saha", 40000, 2020, "7324");
        
        System.out.println("EMPLOYEE INFORMATION:");
        System.out.println("*********************");
        System.out.println("Name: " + emp.getName());
        System.out.println("Year Of Starting: " + emp.getYearOfStart());
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
        System.out.println("Insurance Number: " + emp.getInsurancenumber());
    }
}