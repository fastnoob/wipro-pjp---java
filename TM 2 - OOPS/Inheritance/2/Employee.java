class Employee extends Person {
    double annualSalary;
    int yearOfStart;
    String insuranceNumber;

    Employee() {
        name = "Shayan Saha";
        annualSalary = 40000;
        yearOfStart = 2020;
        insuranceNumber = "7324";
    }

    Employee(String name, double salary, int year, String insurance) {
        this.name = name;
        this.annualSalary = salary;
        this.yearOfStart = year;
        this.insuranceNumber = insurance;
    }

    String getName() {
        return name;
    }
    double getAnnualSalary() {
        return annualSalary;
    }

    int getYearOfStart() {
        return yearOfStart;
    }

    String getInsurancenumber() {
        return insuranceNumber;
    }
}   