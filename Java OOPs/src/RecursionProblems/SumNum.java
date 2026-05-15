package RecursionProblems;

import java.util.Scanner;

public class SumNum {

//    public static int printSum(int num){ // iteration
//        int sum=0;
//        for(int i=1;i<=num; i++){
//            sum += i;
//        }
//        return sum;
//    }

//    public static int printSum(int num){
//        return (num*(num+1))/2; // formula
//    }

    public static int printSum(int num){ // recursion
        if(num==1)
            return 1;
        return num+printSum(num-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.printf("\nSum of first %d natural numbers: %d\n",num,printSum(num));
    }
}
