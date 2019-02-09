package Account;

public class TestAccount {

    public static void main(String[] args){
        Account account = new Account("Test Testerson", 122013, 1109);

        System.out.println("Name: " + account.getName());

        account.setAnnualInterestRate(5.5);

        System.out.println("Annual Interest rate: " + account.getAnnualInterestRate());

        System.out.println("Balance: " + account.getBalance());

        System.out.printf("%-20s%-16s%-16s%-16s%s%n", "Date", "Type", "Amount", "Balance", "Description");
        account.deposit(30, "Allowance");
        account.deposit(40, "Lottery Prize");
        account.deposit(50, "Grandma's Gift");
        account.withdraw(5, "Ice Cream");
        account.withdraw(4, "Scratchcard");
        account.withdraw(2, "Bussticket");

    }

}
