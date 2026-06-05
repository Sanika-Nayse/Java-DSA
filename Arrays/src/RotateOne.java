import java.util.Arrays;
import java.util.Scanner;

public class RotateOne {

    public static void oneRotate(int [] arr, int n){
        int first = arr[0], i;
        for(i=0; i<n-1; i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = first;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array:");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        oneRotate(arr,n);
        System.out.println("Array rotated by one: "+ Arrays.toString(arr));
    }
}
