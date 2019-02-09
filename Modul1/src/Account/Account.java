package Account;

import java.util.ArrayList;

class Account {
  private int id;
  private double balance;
  private static double annualInterestRate;
  private java.util.Date dateCreated;
  private String name;

  ArrayList<Transaction> transactionArrayList = new ArrayList<Transaction>();

  public Account() {
    dateCreated = new java.util.Date();
  }

  public String getName() {
    return name;
  }

  public Account(String name, int newId, double newBalance) {
    this.name = name;
    id = newId;
    balance = newBalance;
    dateCreated = new java.util.Date();
  }

  public int getId() {
    return this.id;
  }

  public double getBalance() {
    return balance;
  }

  public static double getAnnualInterestRate() {
    return annualInterestRate;
  }

  public void setId(int newId) {
    id = newId;
  }

  public void setBalance(double newBalance) {
    balance = newBalance;
  }

  public static void setAnnualInterestRate(double newAnnualInterestRate) {
    annualInterestRate = newAnnualInterestRate;
  }

  public double getMonthlyInterest() {
    return balance * (annualInterestRate / 1200);
  }

  public java.util.Date getDateCreated() {
    return dateCreated;
  }

  public void withdraw(double amount, String description) {
    balance -= amount;
    Transaction withdrawTransaction = new Transaction('W', amount,this.balance, description);
    transactionArrayList.add(withdrawTransaction);
    System.out.println(withdrawTransaction.toString());
  }

  public void deposit(double amount, String description) {
    balance += amount;
    Transaction depositTransaction = new Transaction('D', amount,this.balance, description);
    transactionArrayList.add(depositTransaction);
    System.out.println(depositTransaction.toString());
  }
}
