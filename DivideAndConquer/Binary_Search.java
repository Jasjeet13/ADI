package DivideAndConquer;
import java.util.*;

import javax.swing.text.Position;

public class Binary_Search {
    // QUESTION 1 -> FINDING AN ELEMENT IN A SORTED ARRAY USING BINARY SEARCH
    // public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] array = new int[n];
        // for(int i=0;i<n;i++){
        //     array[i] = sc.nextInt();
        // }
    //     int target = sc.nextInt();
    //     int start = 0;
    //     int end = n-1;
    //     int flag = 0;
    //     while(end>start){
    //         int mid = (start+end)/2;
    //         if(array[mid] == target){
    //             System.out.println("Target element "+target+" found at index: " + mid);
    //             flag = 1;
    //             break;
    //         }
    //         else if(array[mid]>target){
    //             end = mid-1;
    //         }
    //         else{
    //             start = mid+1;
    //         }
    //     }
    //     if(flag == 0){
    //         System.out.println("Element not found");
    //     }
    //     sc.close();
    // }

    // QUESTION 2 -> Find First and Last Position of an Element in Sorted Array
    // Problem: Given a sorted array with duplicate elements, find the first and 
    // last position of a given target.
    // Input: arr = [1, 2, 2, 2, 3], target = 2
    // Output: first = 1, last = 3
    // public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] a = new int[n];
        // for(int i=0;i<n;i++){
        //     a[i] = sc.nextInt();
        // }
    //     int target = sc.nextInt();
    //     int start = 0;
    //     int end = n-1;
    //     int index = 0;
    //     while(end>=start){
    //         int mid = (start+end)/2;
    //         if(a[mid] == target){
    //             index = mid;
    //             end = mid-1;
    //         }
    //         else if(a[mid]>target){
    //             end = mid-1;
    //         }
    //         else{
    //             start = mid+1;
    //         }
    //     }

    //     System.out.println("The first occurence of target is : " + index);


    //     start = 0;
    //     end = n-1;
    //     index = 0;
    //     while(end>=start){
    //         int mid = (start+end)/2;
    //         if(a[mid] == target){
    //             index = mid;
    //             start = mid+1;
    //         }
    //         else if(a[mid]>target){
    //             end = mid-1;
    //         }
    //         else{
    //             start = mid+1;
    //         }
    //     }

    //     System.out.println("The last occurence of the target: " + index);
        

    //     sc.close();
    // }

    // QUESTION 3 -> Find Peak Element
    // Problem: Given an array where arr[i] ≠ arr[i + 1], find a peak element 
    // (an element that is greater than its neighbors).
    // Input: arr = [1, 2, 3, 1]
    // Output: 2 (or index of peak, here index 2 where arr[2] = 3)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        int start = 0;
        int end = n-1;
        while(end>=start){
            int mid = (start+end)/2;
            if(a[mid]>a[mid+1] && a[mid]>a[mid-1]){
                System.out.println("The peak elemet is: " + a[mid]);
            }
            else 
        }

          
    }

}
