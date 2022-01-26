package com.company;

public class Main {

    public static void main(String[] args) {
	BankAccount account = new BankAccount();
    account.deposit(20000);
        System.out.println(account.getAmount());

        while (true) {
            try {
                account.withDraw(6000);
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                try {
                    account.withDraw((int) account.getAmount());
                } catch (LimitException ex) {
                    System.out.println(ex.getMessage());
                }
                break;
            }
        }
    }
}
