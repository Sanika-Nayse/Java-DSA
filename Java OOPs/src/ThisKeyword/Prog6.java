package ThisKeyword;

class Calculator{

    void add(int a, int b){
        int sum = a+b;
        System.out.println("Sum = "+sum);
    }

    void displaySum(int a, int b){
        this.add(a,b);
    }
}

public class Prog6 {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.displaySum(23,23);
    }
}
