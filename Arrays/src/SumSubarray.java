import java.util.*;

public class SumSubarray {

    public static int maxSum(int [] arr){
        int n = arr.length, max=Integer.MIN_VALUE, mi=0,mj=0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int sum = 0;
                for(int k=i; k<=j; k++){
                    sum = sum+arr[k];
                }
                if(sum>max) {
                    max = sum;
                    mi = i;
                    mj = j;
                }
            }
        }
        System.out.println("Max sum subarray: "+Arrays.toString(Arrays.copyOfRange(arr,mi,mj+1)));
        return max;
    }

    public static int minSum(int [] arr){
        int n = arr.length, min=Integer.MAX_VALUE, mi=0,mj=0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int sum = 0;
                for(int k=i; k<=j; k++){
                    sum = sum+arr[k];
                }
                if(sum<min) {
                    min = sum;
                    mi = i;
                    mj = j;
                }
            }
        }
        System.out.println("Min sum subarray: "+Arrays.toString(Arrays.copyOfRange(arr,mi,mj+1)));
        return min;
    }

    public static int kadanes(int arr[]){
        int n = arr.length;
        int start=0, end=0, tempStart=0;
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            start = tempStart;
            cs += arr[i];
            if(ms<cs){
                ms=cs;
                end = i;
            }
            if(cs < 0) {
                cs = 0;
                tempStart = i + 1;
            }
        }
        System.out.println("Max sum array: "+ Arrays.toString(Arrays.copyOfRange(arr,start,end+1)));
        return ms;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of elements in array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int max=Integer.MIN_VALUE;
        System.out.println("Enter the array elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        boolean neg = true;
        for(int val : arr){
            if(val>0) {
                neg = false;
                break;
            }
            max = Math.max(val,max);
        }
        if(neg)
            System.out.println("Max Subarray sum = " + max);
        else
            System.out.println("Max Subarray sum = "+kadanes(arr));
        //System.out.println("Min Subarray sum = "+minSum(arr));
    }
}
