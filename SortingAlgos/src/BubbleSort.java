import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

//    public void bubbleSort(int []arr){ //Brute force
//        int n = arr.length, temp;
//        for(int i=0;i<n-1;i++){
//            for(int j=0;j<n-1-i;j++){
//                if(arr[j] > arr[j+1]){
//                    temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//    }

    public void bubbleSort(int []arr){ //Optimal approach
        int n = arr.length, temp;
        for(int i=0;i<n-1;i++){
            boolean flag = false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag)
                break;
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
        BubbleSort obj = new BubbleSort();
        obj.bubbleSort(arr);
        System.out.println("\nSorted array: "+ Arrays.toString(arr));
    }
}
