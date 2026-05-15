class Person{
    Person(){
        System.out.println("Hello there!!");
    }
}

class Student extends Person{
    Student(){
        System.out.println("I am a student\n");
//        new Teacher (this);
    }
}

class Teacher extends Person{
    Teacher(){
        System.out.println("Hello I am a teacher\n");;
    }
}

public class HeirarInherit {
    public static void main(String[] args) {
        Student obj1 = new Student();
        Teacher obj2 = new Teacher();
    }
}
