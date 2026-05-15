package BasicMathPrograms;
import java.util.Scanner;

public class GCD2 {

    public static int gcd (int n1, int n2){ // better approach
        for(int i=Math.min(n1,n2); i>=1; i--){
            if(n1%i == 0 && n2%i==0)
                return i;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.printf("GCD of %d and %d = %d", num1,num2,gcd(num1,num2));
    }
}


