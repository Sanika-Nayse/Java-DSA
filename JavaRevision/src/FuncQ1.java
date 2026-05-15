import java.util.Scanner;

public class FuncQ1 {
    public static void main(String[] args) {
        double num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        num1= sc.nextDouble();
        num2= sc.nextDouble();
        num3= sc.nextDouble();
        average(num1,num2,num3);
    }

    public static void average(double num1, double num2, double num3){
        System.out.printf("Average = %.2f", (num1+num2+num3)/3);
    }
}
