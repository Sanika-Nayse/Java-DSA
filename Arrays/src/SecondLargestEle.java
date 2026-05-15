import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestEle {

    public void secondMaxMin(int [] arr, int n){
        Arrays.sort(arr);
        int max = arr[n-1];
        int min = arr[0];
//        System.out.println("\nLargest Element: "+ max);
//        System.out.println("\nSmallest Element: "+ min);
        int smax=-1, smin=-1;
        for(int i=1; i<n; i++){
            if(arr[i]>min){
                smin = arr[i];
                break;
            }
        }
        for(int i=n-2; i>=0; i--){
            if(arr[i]<max){
                smax = arr[i];
                break;
            }
        }
        System.out.println("\nSecond Largest Element: "+ smax);
        System.out.println("\nSecond Smallest Element: "+ smin);
    }

    public void optSecondMaxMin(int [] arr, int n){
        int max=arr[0], min=arr[0];
        for(int i=0; i<n; i++){
            if(arr[i] < min)
                min=arr[i];
            if(arr[i] > max)
                max=arr[i];
        }
        int smax=min, smin=max;
        if(min==max){
            smin=-1;
            smax=-1;
        }
        else{
            for(int i=0; i<n; i++){
                if(arr[i] > min && arr[i] < smin)
                    smin=arr[i];
                if(arr[i] < max && arr[i] > smax)
                    smax=arr[i];
            }
        }
        System.out.println("\nSecond Largest Element: "+ smax);
        System.out.println("Second Smallest Element: "+ smin);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter no. of elements in array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter elements of array: ");
        for(int i=0; i<n; i++)
            arr[i]=sc.nextInt();
        SecondLargestEle obj = new SecondLargestEle();
        obj.optSecondMaxMin(arr, n);
    }
}
