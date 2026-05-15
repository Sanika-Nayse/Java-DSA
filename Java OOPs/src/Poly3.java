class TypeTest{
    void show(int a){
        System.out.println("int a = "+a);
    }
    void show(double a){
        System.out.println("double a = "+a);
    }
}

public class Poly3 {
    public static void main(String[] args) {
        TypeTest obj = new TypeTest();
        obj.show(5);
        obj.show(5.5);
        obj.show('A');
    }
}
