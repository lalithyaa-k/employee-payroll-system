package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PayrollTest {

    @Test
    void testSalary() {
        PayrollService p = new PayrollService();
        Employee e = new Employee(10000);

        assertEquals(12000, p.calculate(e));
    }
}