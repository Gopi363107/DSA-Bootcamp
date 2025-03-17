//to sort the array using 
//time complexity : O(N^2)
//space complexity : O(1)
import java.io.*;
import java.util.Scanner;

public class selection_sort {

    public static void sorted( int[] arr,int n){
        
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
               if(arr[j] < arr[min]) {
                    min = j;
               }
            }

            //swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        System.out.println("After selection sort : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //getting n value from the user
        System.out.println("enter the number of an element in an array :");
        int n =sc.nextInt();

        //gettin array element from user
        int[] arr = new int[n];
        System.out.println("enter elements to store an array :");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        //to show the before sorting in an array
        System.out.println("Before selection sort : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sorted(arr,n);
    }
    
}
