package ThisKeyword;

class Printer{
    void printMessage(){
        System.out.println("Hello World from here");
    }
    void start(){
        this.printMessage();
    }
}

public class Prog5 {
    public static void main(String[] args) {
        Printer obj = new Printer();
        obj.start();
    }
}
