package it.unibo.inheritance.impl;

public class ExtendedStrictBankAccount extends SimpleBankAccount{
    private static final double TRANSACTION_FEE = 0.1;
    
    private int id;
    private double balance;
    private int transactions;

    public ExtendedStrictBankAccount(int id, double balance){
        super(id, balance);
    }

    @Override
    public void chargeManagementFees(final int id) {
        final double feeAmount = MANAGEMENT_FEE + transactions * TRANSACTION_FEE;
        if (checkUser(id) && isWithdrawAllowed(feeAmount)) {
            balance -= feeAmount;
            transactions = 0;
        }
    }

    private boolean isWithdrawAllowed(final double amount) {
        return balance >= amount;
    }

    private void transactionOp(final int id, final double amount) {
        if (checkUser(id)) {
            this.balance += amount;
            this.incrementTransactions();
        }
    }
   
}
