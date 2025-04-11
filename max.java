
import java.util.Scanner;

public class max{
    public static void main(String args []){
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

        //main logic
        //find maximum value in an array
        int maxval=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>maxval){
                maxval=arr[i];
            }
        }

        //print largest number
       System.out.println("Maximum value in an array "+maxval);
    

        in.close();
    }
}