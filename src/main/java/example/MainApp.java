package com.example;

public class MainApp {
    public static void main(String[] args) {
        Employee e = new Employee(10000);
        PayrollService p = new PayrollService();

        System.out.println("Salary: " + p.calculate(e));
    }
}