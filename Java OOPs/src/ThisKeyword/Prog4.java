package ThisKeyword;

class Employee{
    String name, role;
    double salary;

    Employee(String name){
        this(name,23283.23);
    }
    Employee(String name, double salary){
        this(name,salary,"Manager");
    }
    Employee(String name, double salary, String role){
        System.out.printf("Name: %s\nSalary: $%.2f\nRole: %s",name,salary,role);
    }
}

public class Prog4 {
    public static void main(String[] args) {
        Employee obj = new Employee("Ravi");
    }
}
