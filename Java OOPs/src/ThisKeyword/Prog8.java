package ThisKeyword;

class Account{
    double balance;

    Account deposit(int amount){
        this.balance += amount;
        return this;
    }

    Account withdraw(int amount){
        this.balance -= amount;
        return this;
    }
}

public class Prog8 {
    public static void main(String[] args) {
        Account obj = new Account();
        obj.balance= 20000;
        obj.deposit(677).withdraw(13000);
        System.out.println("Balance = "+obj.balance);
    }
}
