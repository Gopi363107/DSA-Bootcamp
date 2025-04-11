import java.util.Scanner;
import java.util.Arrays;

public class secsmallest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        //get n input from the user
        System.out.println("enter the value of n :");
        int n=sc.nextInt();

        //get array element values
        System.out.println("enter the element for an array :");
        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        //print the original array
        System.out.println("your original array :");
        System.out.println(Arrays.toString(arr));

        //main logic
        int min=arr[0];
        int smin=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                smin=min;
                min=arr[i];
            }
            else if( arr[i] > min && arr[i] < smin){
                smin=arr[i];
            }
        }
        System.out.println("your second smallest number :"+smin);
        sc.close();
    }
    
}
