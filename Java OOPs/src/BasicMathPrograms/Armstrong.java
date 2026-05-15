package BasicMathPrograms;
import java.util.Scanner;

public class Armstrong {

    public static boolean isArmstrong(int num){
        int n = num, rem=0, len= String.valueOf(num).length(), armNo=0;
        while(n>0){
            rem= n%10;
            armNo += Math.pow(rem,len);
            n/=10;
        }
        return armNo==num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println(num + " is"+ ((isArmstrong(num))?"":" not") + " an Armstrong number");
    }
}
