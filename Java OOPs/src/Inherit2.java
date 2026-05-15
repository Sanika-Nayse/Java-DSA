class Vehicle{
    void display(){
        System.out.println("This is a Vehicle class display method");
    }
}

class Car2 extends Vehicle{
    void display(){
        super.display();
        System.out.println("This is a Car class display method");
    }
}

public class Inherit2 {
    public static void main(String[] args) {
        Car2 c= new Car2();
        c.display();
    }
}
