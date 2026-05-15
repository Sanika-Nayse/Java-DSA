package RecursionProblems;
import java.util.Scanner;

public class Factorial {

    public static long printFact(int num){ // recursion
        if(num==1 || num==0)
            return 1;
        return num*printFact(num-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num<0)
            System.out.println("Number must be non negative");
        else
            System.out.printf("Factorial of %d = %d\n",num,printFact(num));
    }

}
