package com.syntax.class31;

public class Account {
    public static void Withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0) {
            throw new InsufficientBalanceException("Amount can't be negative");
        }
    }
}
