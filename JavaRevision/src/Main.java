import java.util.Date;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        char a= 0x0906, b='大';
        short n = 78;
        int viewsCount = 12_676_678; // _ is used for readability
        int binN = 19;
        long nL = 6_237_346_342L; // use L or l for Long as it considers integer by default
        float n1 = 89.89F; // use F or f for float as it considers double by default
        double n2 = 79827.32D;
        boolean isEligible = true;
        Date now = new Date();
        System.out.println(a +" "+b);
        System.out.println("Views = "+viewsCount);
        System.out.println("Current date: "+ now);
    }
}