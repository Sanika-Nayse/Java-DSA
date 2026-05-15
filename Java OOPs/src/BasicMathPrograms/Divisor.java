package BasicMathPrograms;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Scanner;

public class Divisor {

    public static ArrayList<Integer> divisors(int num){
        //int [] div = new int[num];
        ArrayList<Integer> list = new ArrayList<>();
        int j=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                list.add(i);
            }
        }
        return list;
        //return Arrays.copyOf(div,j);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println("Divisors of "+num+" are: "+ divisors(num));
    }
}
