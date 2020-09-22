package com;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        FileOutputStream fileOutput = new FileOutputStream("Data.txt");
        ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);

        FileInputStream fileInput = new FileInputStream("Data.txt");
        ObjectInputStream objectInput = new ObjectInputStream(fileInput);
        do{
            System.out.println("Main menu\n"+
                                "1. Add an employee\n"+
                                "2. Display all\n"+
                                "3. Exit\n");
            System.out.print(">> ");
            n=sc.nextInt();
            switch(n){
                case 1:
                    Employee employee = new Employee();
                    System.out.print("Enter Employee ID: ");
                    employee.setEmpid(sc.nextInt());
                    sc.nextLine();
                    System.out.print("Enter Employee Name: ");
                    employee.setEmpName(sc.nextLine());
                    System.out.print("Enter Employee Age: ");
                    employee.setEmpAge(sc.nextInt());
                    System.out.print("Enter Employee Salary: ");
                    employee.setEmpSalary(sc.nextDouble());
                    objectOutput.writeObject(employee);
                    break;
                case 2:
                    System.out.println("----Report-----");
                    employee = null;
                    while (fileInput.available() > 0) {
                    employee = (Employee) objectInput.readObject();
                    System.out.println(employee);
                    }
                    System.out.println("----End of Report-----");
                    break;
                case 3:
                    System.out.println("Exiting application");
            }
        }while(n!=3);
        fileInput.close();
        fileOutput.close();
        objectInput.close();
        objectOutput.close();
    }
}
