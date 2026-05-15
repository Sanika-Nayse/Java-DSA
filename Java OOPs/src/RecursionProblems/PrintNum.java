package RecursionProblems;

import java.util.Scanner;

public class PrintNum {
    public static void printNum(int num){
        if(num<=0)
            return;
        printNum(num-1);
        System.out.println(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        printNum(num);
    }
}
