package BasicMathPrograms;

public class Palindrome {
    public static boolean isPalindrome(int x) {
        int i=0, n=x, rem=0, rev=0, len= (int)(Math.log10(x)+1), left_len=(len+1)/2;

        if(x<0 || x%10==0){
            return false;
        }

        else{
            while(i< (len/2) && n>0){
                rem=n%10;
                rev = rev*10 + rem;
                n = n / 10;
                i++;
            }
            System.out.println("Reverse number = "+ rev);
            System.out.println("First half number = "+ x/Math.pow(10,left_len));
            if(x==0 || (int)(x/Math.pow(10,left_len)) == rev){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Is palindrome: "+ isPalindrome(18981));
    }
}


