package com;

import java.io.Serializable;

public class Employee implements Serializable{
    private int empid;
    private String empName;
    private int empAge;
    private double empSalary;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }
    @Override
    public String toString() {
        return empid + " " + empName + " " + empAge + " " + empSalary;
    }
}

