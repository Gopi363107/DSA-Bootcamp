
import java.util.Scanner;

public class min {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        //get input from user
        System.out.println("enter the value of n :");
        int n=sc.nextInt();
        System.out.println("enter the element in an array :");
        int[] arr=new int[n];
        
        //using for loop
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //main logic 
        int minval=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<minval){
                minval=arr[i];
            }
        }

        System.out.println("minimum value in an array "+minval);
        sc.close();
    }
    
}
