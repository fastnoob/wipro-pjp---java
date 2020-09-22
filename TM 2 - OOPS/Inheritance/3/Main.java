class Person {
    String name;
    String dateOfBirth;
}

class Teacher extends Person {
    double salary;
    String subject;
    

    Teacher(String n, String dob, double s, String sub) {
        name = n;
        dateOfBirth = dob;
        salary = s;
        subject = sub;
    }

    void display() {
    	System.out.println("INFORMATION OF TEACHER");
    	System.out.println("=======================");
        System.out.println("Name: " + name);
        System.out.println("Date of birth: " + dateOfBirth);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);

    }
}

class Student extends Person {
    String studentID;
}

class CollegeStudent extends Student {
   	String collegeName;
   	String year;

    CollegeStudent(String n, String dob, String id, String colName, String y) {
        name = n;
        dateOfBirth = dob;
        studentID = id;
        collegeName = colName;
        year = y;
    }

    void display() {
    	System.out.println("INFORMATION OF STUDENT");
    	System.out.println("=======================");
        System.out.println("Name: " + name);
        System.out.println("Date of birth: " + dateOfBirth);
        System.out.println("Student ID: " + studentID);
        System.out.println("College Name: " + collegeName);
        System.out.println("Current year: " + year);
    }
}

class Main {
    public static void main(String[] args) {
        Teacher t = new Teacher("Elliot Alderson", "07/03/1982", 50000, "Ethical Hacking");
        CollegeStudent s = new CollegeStudent("Shayan Saha", "08/05/1997", "16UCE006", "NIT AGARTALA", "FOURTH");
        t.display();
        s.display();
    }
}

