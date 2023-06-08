package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {
    @Test
    public void testGetBalance() {
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Test com.company.Customer");

        AccountRecord record1 = new AccountRecord();
        record1.setCharge(1000);
        record1.setChargeDate("06-08-2023");

        AccountRecord record2 = new AccountRecord();
        record2.setCharge(-500);
        record2.setChargeDate("06-09-2023");

        customer.getCharges().add(record1);
        customer.getCharges().add(record2);

        int expectedBalance = 500;
        int actualBalance = customer.getBalance();

        assertEquals(expectedBalance, actualBalance);
    }

    @Test
    public void testToString() {
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Test com.company.Customer");

        String expectedOutput = "com.company.Customer ID: 1 | com.company.Customer Name: Test com.company.Customer | com.company.Customer Balance: 0";
        String actualOutput = customer.toString();

        assertEquals(expectedOutput, actualOutput);
    }
}
