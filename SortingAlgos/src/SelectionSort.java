import java.util.*;

public class SelectionSort {

    public static void selectionSort(int [] arr){
        int n = arr.length;
        int min, temp;
        for(int i=0; i<n; i++)
        {
            min = i;
            for(int j=i+1; j<n; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
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
        selectionSort(arr);
        System.out.println("\nSorted array: "+ Arrays.toString(arr));
    }
}
