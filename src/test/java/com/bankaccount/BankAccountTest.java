package com.bankaccount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount("Adwaith", "BA1001", 1000);

        account.deposit(500);

        assertEquals(1500, account.checkBalance());
    }

    @Test
    public void testWithdraw() {
        BankAccount account = new BankAccount("Adwaith", "BA1002", 2000);

        boolean result = account.withdraw(500);

        assertTrue(result);
        assertEquals(1500, account.checkBalance());
    }

    @Test
    public void testWithdrawWithInsufficientBalance() {
        BankAccount account = new BankAccount("Adwaith", "BA1003", 1000);

        boolean result = account.withdraw(1500);

        assertFalse(result);
        assertEquals(1000, account.checkBalance());
    }

    @Test
    public void testAccountDetails() {
        BankAccount account = new BankAccount("Adwaith", "BA1004", 5000);

        String details = account.getAccountDetails();

        assertTrue(details.contains("Adwaith"));
        assertTrue(details.contains("BA1004"));
    }
}