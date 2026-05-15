package RecursionProblems;
import java.util.Scanner;

public class PrintNumRev {
    public static void printNumReverse(int num){
        if(num<=0)
            return;
        System.out.print(num+ " ");
        printNumReverse(num-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        printNumReverse(num);
    }
}
