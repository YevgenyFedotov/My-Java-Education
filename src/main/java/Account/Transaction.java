package Account;

import java.util.Date;

public final class Transaction {
    private Date dateOfTransaction;
    private char type;
    private double amount;
    private double balance;
    private String description;

    protected Transaction(char type , double amount , double balance , String description){
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        dateOfTransaction = new Date();
    }

    public Date getDateOfTransaction() {
        return dateOfTransaction;
    }

    public char getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString(){
        return "Дата: " + dateOfTransaction.toString() + "\tТранзакция: " + type + amount + "\tБаланс после транзакции: " + balance + '\n';
    }
}
