package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class CountArray {

//    public static void countElementFrequency(int [] arr){ //Brute Force Method
//        boolean visited[] = new boolean[arr.length];
//        int count;
//        System.out.println("Element\tCount");
//        for(int i = 0; i<arr.length; i++){
//            if(!visited[i]){
//                count = 1;
//                for(int j=i+1; j<arr.length; j++){
//                    if(arr[i]==arr[j]){
//                        visited[j]= true;
//                        count++;
//                    }
//                }
//                visited[i]= true;
//                System.out.println(arr[i]+"\t\t"+count);
//            }
//        }
//    }

//    public static void countElementFrequency(int [] arr){ //Better approach - array hashing
//        int hash[] = new int[Arrays.stream(arr).max().getAsInt()+1]; // cause array starts from zero
//        System.out.println("Element\tCount");
//        for(int i = 0; i<arr.length; i++){
//            hash[arr[i]] +=1;
//        }
//        for(int j = 0; j<hash.length; j++){
//            if(hash[j]!=0)
//                System.out.println(j+"\t\t"+hash[j]);
//        }
//    }
    public static void countElementFrequency(int [] arr){ //OPTIMAL approach - hash map
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        System.out.println("Element\tCount");
        for(int i: map.keySet())
            System.out.println(i+"\t\t"+map.get(i));
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array: ");
        num = sc.nextInt();
        int [] arr = new int[num];
        System.out.println("Enter array elements:");
        for(int i=0;i<num;i++)
            arr[i] = sc.nextInt();
        countElementFrequency(arr);
    }
}
