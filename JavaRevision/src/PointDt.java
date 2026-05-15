import java.awt.*;

public class PointDt {
    public static void main(String[] args) {
        Point pt = new Point(3,4);
        Point pt1 = pt;
        pt.y=5;
        System.out.println("Point pt: "+ pt);
        System.out.println("Point pt1: "+ pt1);
        pt1.x=2;
        System.out.println("Point pt: "+ pt);
        System.out.println("Point pt1: "+ pt1);
    }
}
