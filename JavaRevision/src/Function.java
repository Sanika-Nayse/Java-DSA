import java.util.Scanner;

public class Function {
    public static void printName(String name){
        System.out.println("Name: "+name
        );
    }
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name=sc.nextLine().trim();
        printName(name);
    }
}
