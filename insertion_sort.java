//to sort array using insertion sort
//time complexity :
//space complexity :
import java.util.Scanner;
import java.io.*;


public class insertion_sort {
    public static void sorted(int[] arr,int n){
        for (int i = 0; i < n; i++) {
            int j =i ;
            while(j>0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        System.out.println("after sorting array :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        //to get n value from user
        System.out.println("enter the value of n :");
        int n = sc.nextInt();

        //to get the array element for sorting 
        int[] arr =new int[n];
        System.out.println("enter the element to be stored in an array :");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();   
        }

        System.out.println("before sorting array :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sorted(arr , n);

    }
}
