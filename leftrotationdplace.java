//left rotate by d places
import java.util.Scanner;
import java.util.Arrays;

public class leftrotationdplace {

    public static void leftrotate(int arr[], int d){
        int n=arr.length;
        d=d%n;
        

        //reverse first part 0 to d-1
        reverse(arr,0,d-1);

        //reverse second part d to n-1
        reverse(arr,d,n-1);

        //reverse the entire array 0 to n-1
        reverse(arr,0,n-1);

        


    }

    public static void reverse(int [] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
        

    
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        //get n value from user
        System.out.println("enter the value of n :");
        int n=sc.nextInt();

        //get array elements from user
        System.out.println("enter the element for an array :");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){

            arr[i]=sc.nextInt();
        }

        System.out.println("enter the number of times did you rotate the array :");
        int d=sc.nextInt();

        leftrotate(arr,d);

        

        System.out.println("OPTIMAL APPROACH "+Arrays.toString(arr));
        sc.close();    

        
    }
    
}
