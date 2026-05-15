import static java.lang.Float.NaN;

public class MathFunc {
    public static void main(String[] args) {
        int r = (int)Math.round(232.597); //returns long
        double b = Math.floor(343.232);
        double c = Math.ceil(343.232);
        //double rand = Math.random()*100; // gives between 1 and 100
        double rand = Math.random()*300;   // gives between 1 and 300
        int randI = (int)Math.random();// 'Math.random()' cast to 'int' is always rounded down to '0'
        int randI1 = (int)(Math.random()*100);
        System.out.println(r);
        System.out.println(b);
        System.out.println(c);
        System.out.println(Math.max(32,67.34));
        System.out.println(Math.min(32,67.34));
        System.out.println(rand);
        System.out.println(randI1);
        System.out.println(Math.pow(5,4.1));
    }
}
