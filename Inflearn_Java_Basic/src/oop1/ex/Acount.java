package oop1.ex;

public class Acount {
    int balance;

    int deposit(int amount) {
        return balance + amount;
    }

    int withdraw(int amount) {
        if (balance - amount < 0) {
            System.out.println("잔액 부족");
            return 0;
        }

        return balance - amount;
    }
}
