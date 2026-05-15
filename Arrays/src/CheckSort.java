/*
Problem Statement: Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not.
If the array is sorted then return True, Else return False.
*/

import java.util.Scanner;

public class CheckSort{
    public static boolean isSorted(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<=arr[i+1])
                continue;
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array:");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.println("The array " + (isSorted(arr)?"is":"is not")+ " sorted");
    }

}
