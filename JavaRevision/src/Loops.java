import java.util.Scanner;

public class Loops {
    public static void main(String[] args){
        String str;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Input: ");
            str= sc.nextLine().toLowerCase();
            if(str.equals("quit"))
                break;
            if(str.equals("pass"))
                continue;
            System.out.println(str);
        }while(true);

        //do not compare 2 strings like this :
        //if(str == "Hello") //“Why does == sometimes work with strings?”--Answer: Because of Java String Pool optimization where identical literals share the same reference.
            //System.out.println("True")
    }
}
