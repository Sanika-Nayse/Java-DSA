import bank.Bank;

public class PackageUse {
    public static void main(String[] args) {
        Bank obj = new Bank();
        obj.credit(112323);
        obj.debit(323);
        System.out.println(obj.balance);
    }
}
