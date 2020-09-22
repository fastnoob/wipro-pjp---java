package com;
import java.io.*;

public class Deserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee emp2 = null;
        try {
            FileInputStream fileInput = new FileInputStream("data.txt");
            ObjectInputStream objectInput = new ObjectInputStream(fileInput);
            emp2 = (Employee) objectInput.readObject();
            fileInput.close();
            objectInput.close();
        } finally {
            System.out.println("Deserialized Datas");
            System.out.println("-------------------");
            System.out.println("NAME: " + emp2.getName());
            System.out.println("DATE OF BIRTH: " + emp2.getDateOfBirth());
            System.out.println("DEPARTMENT: " + emp2.getDepartment());
            System.out.println("DESIGNATION: " + emp2.getDesignation());
            System.out.println("SALARY: " + emp2.getSalary());
        }
    }
}
