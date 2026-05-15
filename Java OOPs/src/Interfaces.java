interface Account {
//    public double balance=0; // it is static and final
    void credit(double amount);
    void debit(double amount);
    void displayBalance();
}

class CreateAccount implements Account{
    double balance;
    CreateAccount(double balance){
        this.balance = balance;
    }
    public void credit(double amount){
        balance += amount;
    }
    public void debit(double amount){
        balance -= amount;
    }
    public void displayBalance(){
        System.out.println("Balance = "+balance);
    }
}

public class Interfaces {
    public static void main(String[] args) {
        CreateAccount obj = new CreateAccount(8742.34);
        obj.credit(1000);
        obj.debit(50);
        obj.displayBalance();
    }
}
