class Calculator{
    public void add(int a, int b){
        System.out.printf("\n%d + %d = %d",a,b,a+b);
    }
    public void add(double a, double b){
        System.out.printf("\n%.4f + %.4f = %.4f",a,b,a+b);
    }
    public void add(int a, int b, int c){
        System.out.printf("\n%d + %d + %d= %d",a,b,c,a+b+c);
    }
}

public class Poly2 {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.add(23,45);
        obj.add(23.34,1000.5);
        obj.add(2,3,5);
    }
}
