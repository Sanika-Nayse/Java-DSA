package RecursionProblems;
import java.util.*;

public class ArrayReverse {

//    public static void reverseArr(int [] arr){ //single pointer approach
//        int n=arr.length, temp=0;
//        for(int i=0; i<n/2;i++){
//            temp= arr[i];
//            arr[i]= arr[n-i-1];
//            arr[n-i-1] = temp;
//        }
//    }

    public static void reverseArr(ArrayList<Integer> arr){ //using collections built in reverse() function
        Collections.reverse(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,3,5,6,7,8));
        System.out.println("Array: "+ arr);
        reverseArr(arr);
        System.out.println("\nReversed array: "+ arr);
    }
}
