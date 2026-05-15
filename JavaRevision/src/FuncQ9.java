import java.util.Scanner;

public class FuncQ9 {
    public static void gcd(int n1,int n2){
        int i=1, gcd=0;
        while(i<=n1 && i<=n2){
            if(n1%i==0 && n2%i==0)
                gcd=i;
            i++;
        }
        System.out.printf("GCD of %d and %d = %d", n1, n2, gcd);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        gcd(n1, n2);
    }
}
