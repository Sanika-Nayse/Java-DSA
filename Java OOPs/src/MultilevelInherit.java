class Animal {
    public void eat(){
        System.out.println("I love to eat bones.");
    }
}

class Dog extends Animal {
    public void bark(){
        System.out.println("I bark a lot.");
    }
}

class Puppy extends Dog {
    public void weeping(){
        System.out.println("I weep a little.");
    }

}

public class MultilevelInherit {
    public static void main(String[] args) {
        Puppy obj = new Puppy();
        obj.eat();
        obj.bark();
        obj.weeping();
    }
}
