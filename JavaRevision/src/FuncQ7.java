import java.util.Scanner;

public class FuncQ7 {
    public static void main(String[] args) {
        int positive=0, negative=0, zero=0, num;
        String input;
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Enter a number or press enter to quit: ");
            input = sc.nextLine();
            if(input.isEmpty())
                break;
            num = Integer.parseInt(input);
            if(num>0)
                positive++;
            else if(num<0)
                negative++;
            else
                zero++;
        }
        System.out.println("\nPositive numbers: " +positive);
        System.out.println("Negative numbers: "+ negative);
        System.out.println("Zero's entered: "+ zero);
    }
}
