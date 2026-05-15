class Car{
    String name;
    String color;

    Car(String name, String color){     //parameterized constructor
        this.name = name;
        this.color = color;
    }

    Car(Car obj1){      //copy constructor
        this.name = obj1.name;
        this.color = obj1.color;
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Car obj1 = new Car("Maruti", "White");
        Car obj2 = new Car(obj1);
        System.out.println("Company: "+ obj2.name + "\nColor: "+obj2.color);
    }
}

