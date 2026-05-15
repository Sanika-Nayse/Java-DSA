import java.util.Scanner;

public class FuncQ3 {
    public static void maxNumber(int num1, int num2){
        System.out.println("Maximum number = "+ ((num1>num2)?num1:num2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        maxNumber(num1,num2);
    }
}
