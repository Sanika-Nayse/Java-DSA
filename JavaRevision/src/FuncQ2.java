import java.util.Scanner;

public class FuncQ2 {
    public static void oddSum(int num){
        int sum=0;
        for(int i=1;i<=num;i++){
            sum += i;
        }
        System.out.println("Sum = "+sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        oddSum(num);
    }
}