package it.unibo.inheritance.api;

public abstract class AbstractBankAccount implements BankAccount{
    public abstract void chargeManagementFees(int id);

    public abstract void deposit(int id, double amount);

    public abstract void depositFromATM(int id, double amount);

    public abstract AccountHolder getAccountHolder();

    public abstract double getBalance();

    public abstract int getTransactionsCount();

    public abstract void withdraw(int id, double amount);

    public abstract void withdrawFromATM(int id, double amount);
}
