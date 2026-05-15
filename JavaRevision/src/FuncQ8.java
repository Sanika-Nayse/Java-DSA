import java.util.Scanner;

public class FuncQ8 {

    public static void power(int x, int n){
        int pow =1;
        for(int i=1; i<=n; i++)
            pow *= x;
        System.out.println(x + " ^ "+n+" = "+pow);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base and exponent: ");
        int x = sc.nextInt();
        int n = sc.nextInt();
        power(x,n);
    }
}
