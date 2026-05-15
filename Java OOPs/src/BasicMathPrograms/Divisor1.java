package BasicMathPrograms;
import java.util.ArrayList;
import java.util.Scanner;

public class Divisor1 {

    public static ArrayList<Integer> divisors(int num){

        ArrayList<Integer> list = new ArrayList<>();
        int j=0;
        for(int i=1;i<=Math.sqrt(num);i++){ // optimized version
            if(num%i==0){
                list.add(i);
                if(i != num/i)
                    list.add(num/i);
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

