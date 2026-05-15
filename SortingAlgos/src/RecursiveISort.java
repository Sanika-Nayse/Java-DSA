import java.util.Arrays;
import java.util.Scanner;

public class RecursiveISort {

    public static void recursiveISort(int [] arr, int n) {
        if (n <= 1)
            return;
        recursiveISort(arr, n-1);
        int j=n-2;
        int ele = arr[n-1];
        while(j>=0 && arr[j]>ele){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = ele;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter no. of elements in array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter elements of array: ");
        for(int i=0; i<n; i++)
            arr[i]=sc.nextInt();
        recursiveISort(arr, n);
        System.out.println("\nSorted array: "+ Arrays.toString(arr));
    }
}


