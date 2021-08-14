import java.util.Scanner;

public class Account {

    private int id;
    private double balance;
    private java.util.Date dateCreated;

    public Account(int id) {
        this.id = id;
        this.balance = 100;
        this.dateCreated = new java.util.Date();
    }

    public double getBalance() {
        return balance;
    }

    public int getID() {
        return id;
    }


    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    public void setID(int newID) {
        id = newID;
    }

    public double withDraw(double withDrawAmount) {
        return balance = balance - withDrawAmount;
    }

    public double deposit(double depositAmount) {
        return balance = balance + depositAmount;
    }
}
