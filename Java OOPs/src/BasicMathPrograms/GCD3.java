package BasicMathPrograms;
import java.util.Scanner;

public class GCD3 {

    public static int gcd (int n1, int n2){ // optimal approach
        while(n1>0 && n2>0){ //By Euclidean formula
            if(n1>n2)
                n1%=n2;
            else
                n2%=n1;
        }
        return Math.max(n1,n2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.printf("GCD of %d and %d = %d", num1,num2,gcd(num1,num2));
    }
}


