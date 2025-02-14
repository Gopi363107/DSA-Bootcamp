import java.util.Scanner;
import java.util.Arrays;

public class removeduplicates {

    static int OriginalElements(int[] arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        
        return i+1;
    }

    //time complexity O(N)
    //space complexity O(1)
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n ");
        int n=sc.nextInt();
        System.out.println("enter the array elements :");
        
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(OriginalElements(arr));
    }    
}
