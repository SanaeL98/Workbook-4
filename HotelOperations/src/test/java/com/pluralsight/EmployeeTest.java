package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    void punchIn() {
        Employee emp = new Employee("E001", "Sara", "Housekeeping", 15.0, 0, 0);
        emp.punchIn(9.0);
    }

    @Test
    void punchOut() {
        Employee emp = new Employee("E001", "Sara", "Housekeeping", 15.0, 0, 0);
        emp.punchIn(9.0);
        emp.punchOut(17.5);
        assertEquals(8.5, emp.getHoursWorked(), 0.01);
    }
}