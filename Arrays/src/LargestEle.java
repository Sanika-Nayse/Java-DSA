import java.util.Scanner;

public class LargestEle {
    public int largestEle(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter no. of elements in array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter elements of array: ");
        for(int i=0; i<n; i++)
            arr[i]=sc.nextInt();
        LargestEle obj = new LargestEle();
        System.out.println("Largest element: "+obj.largestEle(arr));
    }
}