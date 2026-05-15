package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class MaxMinFrequency {
//    public static void countMaxMinFrequency(int []arr){ //Brute Force Approach
//        int max=0, min=arr.length, count, min_ele=0,max_ele=0;
//        boolean vis[] = new boolean [arr.length];
//        for(int i=0;i<arr.length; i++){
//            count= 1;
//            if(!vis[i]){
//                for(int j=i+1; j<arr.length; j++){
//                    if(arr[i] == arr[j])
//                    {
//                        vis[i]=true;
//                        count++;
//                    }
//                }
//                if(count<min){
//                    min = count;
//                    min_ele = arr[i];
//                }
//                if(count>max){
//                    max = count;
//                    max_ele = arr[i];
//                }
//            }
//        }
//        System.out.println(max_ele+" has maximum frequency of "+max);
//        System.out.println(min_ele+" has minimum frequency of "+min);
//    }

    public static void countMaxMinFrequency(int []arr){ //Optimal Approach
        int max=0, min=arr.length, minEle=0,maxEle=0;
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for(HashMap.Entry<Integer,Integer> entry: map.entrySet()){
            int ele = entry.getKey();
            int freq = entry.getValue();
            if(freq>max){
                max = freq;
                maxEle = ele;
            }
            if(freq<min){
                min = freq;
                minEle = ele;
            }
        }
        System.out.println(maxEle+" has maximum frequency of "+max);
        System.out.println(minEle+" has minimum frequency of "+min);
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array: ");
        num = sc.nextInt();
        int [] arr = new int[num];
        System.out.println("Enter array elements (greater than 0):");
        for(int i=0;i<num;i++)
            arr[i] = sc.nextInt();
        countMaxMinFrequency(arr);
    }
}
