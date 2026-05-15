import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

//    public static void quickSort(int []arr, int lb, int ub){
//        int pivot = arr[lb];
//        int i=lb+1;
//        int j=ub;
//        int temp;
//        while(i<j){
//            while(i<ub && arr[i]<=pivot){
//                i++;
//            }
//            while(j>lb && arr[j]>=pivot){
//                j--;
//            }
//            if(i<j){
//                temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//            }
//            }
//        arr[lb] = arr[j];
//        arr[j] = pivot;
//        if(lb<j)
//            quickSort(arr, lb, j-1);
//        if(j+1<ub)
//            quickSort(arr, j+1, ub);
//    }

    public static void quickSort(int []arr, int lb, int ub){
        if(lb<ub) {
            int pivot = partition(arr, lb, ub);
            quickSort(arr, lb, pivot - 1);
            quickSort(arr, pivot + 1, ub);
        }
    }
    public static int partition(int []arr, int lb, int ub){
        int i=lb-1;
        int pivot = arr[ub];
        int temp;
        for(int j=lb;j<ub;j++){
            if(arr[j]<=pivot){
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        temp = arr[i];
        arr[i] = pivot;
        arr[ub] = temp;
        return i;
    }

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter no. of elements in array: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.print("Enter elements of array: ");
    for(int i=0; i<n; i++)
        arr[i]=sc.nextInt();
    QuickSort.quickSort(arr, 0, n-1);
    System.out.println("\nSorted array: "+ Arrays.toString(arr));
    }
}
