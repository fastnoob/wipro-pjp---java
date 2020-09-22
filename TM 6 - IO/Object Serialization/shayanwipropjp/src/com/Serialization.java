package com;

import java.io.*;
import java.util.Scanner;

public class Serialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        Employee emp1 = new Employee();

        System.out.print("ENTER NAME: ");
        emp1.setName(sc.nextLine());
        System.out.print("ENTER DATE OF BIRTH: ");
        emp1.setDateOfBirth(sc.nextLine());
        System.out.print("ENTER DEPARTMENT: ");
        emp1.setDepartment(sc.nextLine());
        System.out.print("ENTER DESIGNATION: ");
        emp1.setDesignation(sc.nextLine());
        System.out.print("ENTER SALARY: ");
        emp1.setSalary(sc.nextDouble());
        sc.nextLine();
        try {
            FileOutputStream fileOutput = new FileOutputStream("data.txt");
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
            objectOutput.writeObject(emp1);
            fileOutput.close();
            objectOutput.close();
            System.out.println("Information is stored on the file 'data.txt'");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
