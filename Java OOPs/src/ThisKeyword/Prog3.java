package ThisKeyword;

class Car{
    String color;
    Car(){
        this("blue");
    }
    Car (String color){
        System.out.println("The color is "+color);
    }
}

public class Prog3 {
    public static void main(String[] args) {
        Car obj = new Car();
    }
}
