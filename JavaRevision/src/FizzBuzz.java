import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        double number;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = sc.nextDouble();

        if(number%15==0)
            System.out.println("Fizz Buzz");
        else if (number%3==0)
            System.out.println("Buzz");
        else if(number%5==0)
            System.out.println("Fizz");
        else
            System.out.println(number);
        sc.close();
    }
}