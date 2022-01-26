package com.company;

public class BankAccount {
   private double amount;

    public void deposit(double sum) {
        amount += sum;
    }

    public double getAmount() {
        return amount;
    }
    public void withDraw(int sum) throws LimitException{
        if (sum > amount) {
            throw  new LimitException("У вас не достаточно денег", amount);
        }
        System.out.println(amount = amount - sum);

    }
}
