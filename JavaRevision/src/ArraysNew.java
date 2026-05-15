import java.util.Arrays;

public class ArraysNew {
    public static void main(String[] args) {
        int[] arr = new int[7];
        arr[0] = 12;
        arr[2] = 5;
        arr[1] = 23;
        int arr1[] = {2, 8, 1, 4, 5, 6};
        System.out.println("arr = "+ Arrays.toString(arr));
        System.out.println("arr1 = "+ Arrays.toString(arr1));
        System.out.println("Array-arr length = "+ arr.length);
        Arrays.sort(arr1);
        System.out.println("Sorted array: "+ Arrays.toString(arr1));
    }
}
