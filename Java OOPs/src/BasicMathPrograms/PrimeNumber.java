package BasicMathPrograms;
import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int num){

        if(num==0 || num==1)
            return false;

        for(int i=2;i*i<=num;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println(num + " is"+ ((isPrime(num))?"":" not") + " a Prime number");
    }
}
