import java.util.Scanner;

public class FuncQ5 {

    public static void isEligibleForVote(int age){
        System.out.println("Is eligible for vote?: "+ ((age>=18)?"Yes":"No"));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        isEligibleForVote(age);
    }
}
