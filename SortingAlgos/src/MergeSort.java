import java.util.*;

public class MergeSort {

    public static void mergeSort(int arr[], int lb, int ub){
        if(lb<ub){
            int mid =(lb+ub)/2;
            mergeSort(arr, lb, mid);
            mergeSort(arr, mid+1, ub);
            merge(arr,lb,mid,ub);
        }
    }

    public static void merge(int arr[], int lb, int mid, int ub){
        int l1 = mid-lb+1;
        int l2 = ub-mid;
        int larr[] = new int[l1];
        int rarr[] = new int[l2];
        for(int i=0;i<l1;i++)
            larr[i] = arr[lb+i];
        for(int i=0;i<l2;i++)
            rarr[i] = arr[mid+i+1];
        int i = 0, j = 0, k=lb;
        while(i<l1 && j<l2){
            if (larr[i] <= rarr[j]){
                arr[k++] = larr[i];
                i++;
            }
            else{
                arr[k++] = rarr[j];
                j++;
            }
        }
        if(i<l1){
            while(i<l1)
                arr[k++] = larr[i++];
        }
        else{
            while(j<l2)
                arr[k++] = rarr[j++];
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
        mergeSort(arr, 0, n-1);
        System.out.println("\nSorted array: "+ Arrays.toString(arr));
    }
}
