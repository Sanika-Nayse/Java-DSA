class Pen{
    String color;
    String type;
    public void write(){
        System.out.printf("\nHello, I am a %s %s pen.", this.color,this.type);
    }
}

public class OOPs {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        Pen pen2 = new Pen();
        pen1.color = "red";
        pen1.type = "ball";
        pen2.color = "blue";
        pen2.type = "gel";
        pen1.write();
        pen2.write();
    }

}
