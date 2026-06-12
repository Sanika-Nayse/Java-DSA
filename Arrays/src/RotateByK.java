import java.util.Arrays;
import java.util.Scanner;

public class RotateByK {
    public static void kRotate(int []arr, int n, int k){
        int temp[] = new int[n];
        for(int i=0;i<n; i++){
            temp[i] =arr[(i+k)%n];
        }
        for(int i=0;i<n; i++){
            arr[i] = temp[i];
        }
    }

    public static void kRotateOptimal(int []arr, int n, int k){
        int temp = 0, r=k, nI=0; // nI - no.of iterations
        if(k>n)
            r = k-n;
        nI = Math.max(n-r,r);
        System.out.println("nI = "+nI);
        for(int i=0;i<nI; i++) {
            temp = arr[i];
            arr[i] = arr[(i + r) % n];
            arr[(i + r) % n] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array:");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter k by which array needs to be rotated:");
        int k = sc.nextInt();
        kRotateOptimal(arr,n,k);
        System.out.println("Array rotated by k="+k+": "+ Arrays.toString(arr));
    }
}
