import java.util.Arrays;
import java.util.Scanner;

public class reverse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value n :");
        int n=sc.nextInt();
        System.out.println("enter the values for an array ");
        int [] arr=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        //print your original array
        System.out.println("your original array is :");
        //for(int num:arr){
        //    System.out.print(num+" ");
       // }
       System.out.print(Arrays.toString(arr));

        // main logic 
        int i=0;
        int j=n-1;
        while(i>j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }
        System.out.println();

        // print the reversed array
        System.out.println("your reversed array :");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
    
}
