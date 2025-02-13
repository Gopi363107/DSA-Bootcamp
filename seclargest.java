import java.util.Scanner;
import java.util.Arrays;
import java.lang.System;

public class seclargest{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value n :");
        int n=sc.nextInt();

        //get user input value
        System.out.println("enter the values in an array :");
        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        //your original array
        System.out.println("your original array :");
        System.out.println(Arrays.toString(arr));

        //main logic for getting second largest in an array
        int max=arr[0];
        int smax=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];    
            }
            else if(arr[i] < max && arr[i]>smax ) {
                smax=arr[i];
            }
        }

        //print the second largest value
        System.out.println("your second largest value is :"+smax);

    }
}