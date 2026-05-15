import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalc {
    public static void main(String[] args) {
         double principal, mortgage, rate, payNo;
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details below:");
        while(true) {
            System.out.print("Principal ($1K - $1M): ");
            principal = sc.nextDouble();
            if(principal >= 1000 && principal <= 1000000)
                break;
            System.out.println("Enter an amount between 1,000 and 1,000,000.");
        };

        while(true){
            System.out.print("Annual Interest Rate: ");
            rate = sc.nextDouble();
            if(rate>0 && rate<=30)
                break;
            System.out.println("Enter a value greater tha 0 and less than or equal to 30.");
        }

        while(true){
            System.out.print("Period (Years): ");
            payNo = sc.nextDouble();
            if(payNo>0)
                break;
            System.out.println("Enter a value greater tha 0 and less than or equal to 32.");
        };

        payNo = payNo * 12;
        rate = rate/1200; // convert percent into no. and years into months
        mortgage = principal * rate * Math.pow(1+rate, payNo)/(Math.pow(1+rate, payNo) - 1);
        System.out.println("\nMortgage Amount = "+ NumberFormat.getCurrencyInstance().format(mortgage));
        sc.close();
        }
}
