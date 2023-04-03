package org.example;

public class BankAccount {
    private double balance;

    public BankAccount(){
        this.balance = 0;
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) throws IllegalArgumentException {
        if(amount<0){
            throw new IllegalArgumentException("on ne peut pas ajouter du négatif");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws IllegalArgumentException {
        if(amount<0){
            throw new IllegalArgumentException("on ne peut pas retirer du négatif");
        }
        balance -= amount;
    }

    public double checkBalance() {
        return balance;
    }
}