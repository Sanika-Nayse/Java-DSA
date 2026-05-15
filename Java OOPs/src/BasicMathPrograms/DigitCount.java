package BasicMathPrograms;

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        int num, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        n = (num<0)?-num:num;
//        while(n>0){
//            n=n/10;
//            count++;
//        }
        if (num==0)
            System.out.println("Count of digits = "+num);
        else
            System.out.println("Count of digits = "+(int)(Math.log10(num)+1));
    }
}
