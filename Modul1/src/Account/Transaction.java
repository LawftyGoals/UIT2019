package Account;

import java.util.Date;

public class Transaction {

    private double amount;
    double balance;
    String description;
    Date date = new Date();
    char type;

    Transaction(char type, double amount, double balance, String description){

        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    public double getBalance() {
        return balance;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }

    public char getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString(){
        return String.format("%tF %1$tT %-15c %-15.1f %-15.1f %-15s", getDate(), getType(), getAmount(), getBalance(), getDescription());
    }



}
