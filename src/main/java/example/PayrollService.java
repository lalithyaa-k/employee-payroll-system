package com.example;

public class PayrollService {

    public double calculate(Employee e) {
        return e.salary + (0.2 * e.salary); // simple logic
    }
}