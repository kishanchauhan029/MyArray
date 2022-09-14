package bankPackage;

import java.sql.SQLOutput;

public class BankAccount {
    private String accountHolderName;
    private String accountNumber;

    public String getAccountHolderName() {
        return accountHolderName;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolderName='" + accountHolderName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    private double balance;

    public void withdraw(double withdrawAmount){
        if (withdrawAmount<balance) {
            balance = balance - withdrawAmount;
            System.out.println("Withdrew!");
        }
        else {
            System.out.println("insufficient balance!");
        }
    }
    public void deposit(double depositAmount){
        balance = balance + depositAmount;
        System.out.println("Deposited!");
    }
}