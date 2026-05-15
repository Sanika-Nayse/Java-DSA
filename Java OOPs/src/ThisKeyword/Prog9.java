package ThisKeyword;

class Person{
    String name;
    Person(String name){
        this.name=name;
        introduce(this);
    }

    void introduce(Person p){
        System.out.println("Hello, this is "+p.name);
    }
}

public class Prog9 {
    public static void main(String[] args) {
        Person obj = new Person("Surya");
    }
}
