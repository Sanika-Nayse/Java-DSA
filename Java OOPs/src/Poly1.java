
class Area{
    public void area(double radius){
        System.out.println("Area of a circle with radius "+radius+" = "+ Math.PI*Math.pow(radius,2));
    }
    public void area(float length, float breadth){
        System.out.printf("Area of rectangle with l=%f and b=%f is %f",length,breadth,(length*breadth));
    }
    public void area(double base, double height){
        System.out.println("\nArea of a triangle = "+0.5*base*height);
    }
}

public class Poly1 {
    public static void main(String[] args) {
        Area obj = new Area();
        obj.area(45);
        obj.area(23.2F,33F);
        obj.area(23.23,23.32);
    }
}
