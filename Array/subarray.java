
import java.util.Scanner;

public class subarray {
    public static void main(String args[] ){

        Scanner sc=new Scanner(System.in);

        System.out.println("enter the value of n : ");
        int n=sc.nextInt();

        System.out.println("enter the values for array :");
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        // main logic
        for(int si=0;si<n;si++){
            for(int ei=0;ei<n;ei++){
                for(int k=si;k<ei;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }

       
       for(int i=0;i<n;i++){
        System.out.println(arr[i]);
       }
       sc.close();
    }
    
}
