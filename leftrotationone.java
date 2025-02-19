//Left rotate the array by one place

import java.util.Scanner;
import java.util.Arrays;
import java.io.*;


public class leftrotationone {

    //optimal approach

    public static void LeftRotationOne(int arr[]){
        int arr1=arr[0];
        int n=arr.length;
        
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=arr1;
        
        
    }

    //main logic

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the value of n :");
        int n=sc.nextInt();

        System.out.println("enter the value of element in an array :");
        int [] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        LeftRotationOne(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
        
    }
    
}
