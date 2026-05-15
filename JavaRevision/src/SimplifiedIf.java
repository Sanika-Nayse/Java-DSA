import java.util.Scanner;

public class SimplifiedIf {
    public static void main(String[] args) {
        double income;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income:");
        income = sc.nextDouble();
        String hasHighIncome = (income > 50000)?"High Income":"Low Income";
        System.out.println(hasHighIncome);
    }
}
