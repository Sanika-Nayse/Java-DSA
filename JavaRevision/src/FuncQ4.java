import java.util.Scanner;

public class FuncQ4 {
    public static void circumferenceCircle(int radius){
        final float PI = 3.14f;
        System.out.println("Circumference of circle = "+ 2*PI*radius);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of a circle: ");
        int radius = sc.nextInt();
        circumferenceCircle(radius);
    }
}
