import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicate {

    public static int remDuplicate(int []arr,int n){ // O(1) space complexity
        int i, idx=0;
        for(i=1;i<n;i++){
            if(arr[i]==arr[idx]){
                continue;
            }
            idx++;
            arr[idx] = arr[i];
        }
        return idx+1;
    }

    public static int remDuplicateBruteforce(int []arr,int n){ // O(n) space complexity
        HashSet<Integer> seen = new HashSet<>();
        int i, idx=-1;
        for(int ele : arr){
            if(!seen.contains(ele)){
                seen.add(ele);
                idx ++;
                arr[idx] = ele;
            }
        }
        return idx+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements in array:");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
//        remDuplicate(arr,n);
        int u = remDuplicateBruteforce(arr,n);
        System.out.println("After removing duplicates, array: ");
        for(int i=0; i<u; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
