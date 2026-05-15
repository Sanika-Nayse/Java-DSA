import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine().trim();
        System.out.print("Enter your age: ");
        byte age = sc.nextByte();
        System.out.print("Enter your roll no.: ");
        int roll = sc.nextInt();
        System.out.print("Enter your division: ");
        char div = sc.next().charAt(0);
        System.out.print("Are you eligible for exams: ");
        Boolean ans = sc.nextBoolean();
        System.out.println("\nName: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Roll no.: "+ roll);
        System.out.println("Division: "+ div);
        System.out.println("Exams allowed? " + (ans?"Yes":"No"));
    }
}
