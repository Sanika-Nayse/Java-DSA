package ThisKeyword;

import org.w3c.dom.ls.LSOutput;

class Box{
    double length, breadth;
    double calcArea(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
        double area = length*breadth;
        return area;
    }
}

public class Prog2 {
    public static void main(String[] args) {
        Box obj = new Box();
        double area = obj.calcArea(23.1,44.3);
        System.out.println("Area = "+area);
        System.out.printf("Length = %.2f and Breadth = %.2f", obj.length, obj.breadth);
    }
}
