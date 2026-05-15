import java.text.NumberFormat;

public class NumFormat {
    public static void main(String[] args) {
         NumberFormat inst = NumberFormat.getNumberInstance();
         String result1 = inst.format(2313.232);
         System.out.println("Number format: "+result1);

        NumberFormat instC = NumberFormat.getCurrencyInstance();
        String result2 = instC.format(2313.232);
        System.out.println("Number Currency format: "+result2);

        NumberFormat instP = NumberFormat.getPercentInstance();
        String result3 = instP.format(0.23);
        System.out.println("Number Percentage format: "+result3);
    }
}
