import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    public void insertionSort(int [] a){
        int n = a.length, j, i;
        for(i=1;i<n;i++){
            int ele = a[i];
            j=i-1;
            while(j>=0 && a[j]>ele){ //use while loop cause no. of iterations are unknown
                a[j+1]= a[j];
                j--;
            }
            a[j+1] = ele;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter no. of elements in array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter elements of array: ");
        for(int i=0; i<n; i++)
            arr[i]=sc.nextInt();
        InsertionSort obj = new InsertionSort();
        obj.insertionSort(arr);
        System.out.println("\nSorted array: "+ Arrays.toString(arr));
    }
}
