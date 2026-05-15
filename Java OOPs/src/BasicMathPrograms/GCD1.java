package BasicMathPrograms;

import java.util.Scanner;

public class GCD1 {

    public static int gcd (int n1, int n2){
        int gcdN=1;
        for(int i=1; i<=Math.min(n1,n2); i++){
            if(n1%i == 0 && n2%i==0)
                gcdN = i;
        }
        return gcdN;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.printf("GCD of %d and %d = %d", num1,num2,gcd(num1,num2));
    }
}

