public class Strings {
    public static void main(String[] args) {
        String str = "Hello";
        String str1 = "World";
        System.out.printf("str = %s \nstr1 = %s\n",str,str1);
        System.out.println(str.endsWith("lo"));
        System.out.println(str.concat(str1));
        System.out.println(str1.startsWith("Hel"));
        System.out.println(str.length());
        System.out.println(str1.indexOf('o'));
        System.out.println(str.replace("l", "p"));
        System.out.println(str.toUpperCase());
        System.out.println(str);
        //strings are immutable so whenever string is modified by a method then a new string object is created and changes are not done in the original string
    }
}
