package RecursionProblems;
import java.util.Scanner;

public class PrintName {

    private static void printName(int num){
        if(num<=0)
            return;
        //System.out.println("Sanika Nayse " + num);
        printName(num-1);
        System.out.println("Sanika Nayse " + num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        printName(num);
    }
}
