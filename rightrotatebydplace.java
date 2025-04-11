//right rotation by d places
import java.util.Scanner;
import java.util.Arrays;

import java.lang.System;


public class rightrotatebydplace {

    public static void rotateArr(int [] arr,int d){
        int n=arr.length;
        d=d%n;

        //reverse entire array
        reverse(arr,0,n-1);

        //reverse the 0 to d-1 value
        reverse(arr,0,d-1);

        //reverse array d to n-1
        reverse(arr,d,n-1);
    }

    public static void  reverse (int []arr,int start,int end){

        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
         
    }

    


    //main function
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        //find the value of n
        System.out.println("enter the value of n :");
        int n=sc.nextInt();

        //find the values of an array
        System.out.println("enter the values of an array :");

        //create a new array using for loop
        int [] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //find the value of number of rotation
        int d=sc.nextInt();

        rotateArr(arr,d);

        System.out.println("optimal approach (rotated array): "+Arrays.toString(arr));
        sc.close();
    }
    
}
