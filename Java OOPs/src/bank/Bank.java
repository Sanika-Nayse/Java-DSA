package bank;

public class Bank {
    public double balance=0;

    public void credit(double amount){
        balance += amount;
    }
    public void debit(double amount){
        balance -= amount;
    }

}
