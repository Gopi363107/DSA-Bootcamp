//maximum consecutive one's
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class maxconsecutive {

    //brude force approach
    //given array arr[] consisting of only 0's and 1's the task is to find the count of a maximum number of consecutive 1's and 0's present in the array
    /*
     the idea is to traverse the array while keeping track of the current streak of consecutive 1s and 0s .if the sequence is broken
     update the maximum count and reset the current count
     */

    static int MaxConsecutiveOnes(int [] arr){
        int maxCount=0; 
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                maxCount=Math.max(maxCount,count);

            }
            else{
                count=0;

            }
        }
        return maxCount;

    }

    //optimal approach
    
    //main function
    public static void main(String args[]){
        Scanner in=new Scanner (System.in);

        //get n value from user
        System.out.println("enter the value of n :");
        int n=in.nextInt();

        //get array elements from user
        System.out.println("enter the element for an array :");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){

            arr[i]=in.nextInt();
        }
        
        System.out.println("OPTIMAL APPROACH-1 ");
        System.out.println(MaxConsecutiveOnes(arr));

        
    }
    
}
