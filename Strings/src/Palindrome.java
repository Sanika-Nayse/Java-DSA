public class Palindrome {
    public static boolean palindrome(String str){
        int len = str.length();
        for(int i=0; i<len/2; i++){
            if(str.charAt(i)!=str.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "mom";
        System.out.println("String is " + (palindrome(str)?"a":"not a")  +" palindrome");
    }
}
