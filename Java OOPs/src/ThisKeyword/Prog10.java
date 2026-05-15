package ThisKeyword;

class Engine{
    Engine(Car1 obj){
        System.out.println("This is a engine ");
    }
}

class Car1{
    Car1(){
        Engine obj = new Engine(this);
    }
}

public class Prog10{
    public static void main(String[] args) {
        Car1 obj = new Car1();
    }
}


