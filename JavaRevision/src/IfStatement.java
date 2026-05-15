import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        float temp;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the temperature in degree Celsius: ");
        temp = sc.nextFloat();
        if(temp > 30){
            System.out.println("It's a hot day");
        }
        else if(temp>=20)
            System.out.println("It's a nice day");
        else
            System.out.println("It's cold");
    }
}
