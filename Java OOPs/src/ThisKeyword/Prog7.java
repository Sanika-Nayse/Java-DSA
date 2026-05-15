package ThisKeyword;

class Pen{
    String color,type;

    Pen setColor(String color){
        this.color=color;
        return this;
    }
    Pen setType(String type){
        this.type=type;
        return this;
    }
}

public class Prog7 {
    public static void main(String[] args) {
        Pen pen = new Pen();
        pen.setColor("blue").setType("gel");
        System.out.println("Color: "+pen.color+"\nType: "+pen.type);
    }
}
