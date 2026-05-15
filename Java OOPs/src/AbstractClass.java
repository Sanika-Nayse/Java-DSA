abstract class Abstract{
    public abstract void  show();
    void start(){
        System.out.println("This is where the abstract class is");
    }
}

class InheritAbstract extends Abstract{
    public void show(){
        System.out.println("This is an implementation of abstract method");
    }
    int add(int a, int b){
        return a+b;
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        // Creating an abstract class object
        Abstract obj = new Abstract() {
            @Override
            public void show() {
                System.out.println("Hello, you have implemented show method of the abstract class!!");
            }
        };
        obj.start();
        obj.show();
        InheritAbstract obj1 = new InheritAbstract();
        obj1.show();
        System.out.println("Sum = " + obj1.add(8,9));
    }
}
