import java.lang.*;

public class Difference {
    public static void main(String[] args) {
        int a=8;
        int b=a;
        a=9;
        System.out.println("Address of a: "+System.identityHashCode(a)); // not the actual address as java does not reveal it
        System.out.println("Address of b: "+System.identityHashCode(b)); // You can print the identity hash code, which often corresponds to the object's memory identity.
        String str = "Hello";
        System.out.println("Address of str: ");
        String str1 = str;
        System.out.println(System.identityHashCode(str));
        str = "Bro"; // String is immutable → new object created when reassigned
        System.out.println("Address of str: ");
        System.out.println(System.identityHashCode(str));
        System.out.println("Address of str1: ");
        System.out.println(System.identityHashCode(str1));
        System.out.println("b="+b);
        System.out.println("str = "+str);
        System.out.println("str1 = "+str1);
    }
}
