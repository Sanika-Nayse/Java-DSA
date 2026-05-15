import java.util.*;

public class RecursiveBSort {

    public static void recursiveBSort(int arr[], int n){
        int temp;
        boolean swap=false;
        if(n<=1){
            return;
        }
        for(int j=0; j<n-1; j++){
            if(arr[j]>arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swap=true; // optimization
            }
        }
        if(!swap){ // optimization
            // System.out.println("Exited recursive function at i = "+n);
            return;
        }

        recursiveBSort(arr, n-1);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter no. of elements in array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter elements of array: ");
        for(int i=0; i<n; i++)
            arr[i]=sc.nextInt();
        recursiveBSort(arr, n);
        System.out.println("\nSorted array: "+ Arrays.toString(arr));
    }
}
