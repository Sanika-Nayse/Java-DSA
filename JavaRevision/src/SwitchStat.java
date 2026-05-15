import java.util.Scanner;

public class SwitchStat {
    public static void main(String[] args) {

    String role;
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter your role: ");
    role = sc.next();
    switch(role){
        case "admin":
            System.out.println("You are an admin");
            break;
        case "moderator":
            System.out.println("You are a moderator");
            break;
        default:
            System.out.println("You are a guest");
        }
    }
}
