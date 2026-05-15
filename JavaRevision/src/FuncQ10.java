import java.sql.SQLOutput;
import java.util.Scanner;

public class FuncQ10 {

    public static void fibo(int n){
        int n1=0, n2=1, temp;
        System.out.print("Fibonacci series: "+n1+" "+n2);
        for (int i=3;i<=n;i++){
            temp = n1+n2;
            n1 = n2;
            n2 = temp;
            System.out.print(" "+ temp);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci series terms to print: ");
        int n = sc.nextInt();
        fibo(n);
    }
}
