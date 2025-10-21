package com.pluralsight;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    private double REGULAR_HOURS = 40;
    private double OVERTIME_PAY_RATE = 1.15;


    public double getTotalPay() {
        double regularPay = getRegularHours() * payRate;
        double overtimePay = getOvertimeHours() * (1 + OVERTIME_PAY_RATE);
        return regularPay + overtimePay;
    }

    public double getRegularHours() {
        if (hoursWorked <= REGULAR_HOURS) {
            return hoursWorked;
        } else {
            return REGULAR_HOURS;
        }
    }

    public double getOvertimeHours() {
        if (hoursWorked > REGULAR_HOURS) {
            return hoursWorked - REGULAR_HOURS;
        } else {
            return 0;
        }
    }

    public LocalTime punchIn() {
        LocalTime punchIn = LocalTime.now().withNano(0);
        return punchIn;
    }

    public LocalTime punchOut() {
        LocalTime punchOut = LocalTime.now().withNano(0);
        return punchOut;
    }
}

