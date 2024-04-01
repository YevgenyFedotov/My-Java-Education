package Unsorted.Account;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate = 0;
    private Date dateCreated;
    protected String name;
    private AbstractList<Transaction> transactions = new ArrayList<Transaction>();

    public Account(){
        this(0,0, "None");
    }
    public Account(int id, double balance){
        this(id, balance, "None");
    }
    public Account(int id, double balance, String name){
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
    public static void setAnnualInterestRate(double annualInterestRate){
        Account.annualInterestRate = annualInterestRate;
    }
    public static double getAnnualInterestRate(){
        return Account.annualInterestRate;
    }
    public long getDateCreated(){
        return this.dateCreated.getTime();
    }
    public double getMonthlyInterest(){
        return this.balance * (Account.annualInterestRate / 12.0 / 100);
    }
    public void withdraw(double withdraw){
        this.balance -= withdraw;
        transactions.add(new Transaction('-' , withdraw, balance, "000-"));
    }
    public void deposit(double deposit){
        this.balance += deposit;
        transactions.add(new Transaction('+', deposit, balance, "000+"));
    }

    /*public void checkTransaction(){
        for (Transaction transaction : transactions){
            System.out.println(transaction.toString());
        }
    }*/
    @Override
    public String toString(){
        return name + "\nПроцентная ставка: " + annualInterestRate + "\nБаланс " + balance + "\nТранзакции:\n" + transactions.toString();
    }
}
