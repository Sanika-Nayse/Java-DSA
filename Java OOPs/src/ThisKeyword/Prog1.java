package ThisKeyword;

class Student{
    String name;
    int age;
    public void setData(String name, int age){
        this.name = name;
        this.age = age;
        this.display();
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

}

public class Prog1 {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setData("Sanika",22);
    }
}
