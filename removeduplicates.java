import java.util.Scanner;
import java.util.Arrays;

public class removeduplicates {

    static boolean arraySortedOrNot(int[] arr){
        //main logic
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=arr[i-1]){

            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n ");
        int n=sc.nextInt();
        System.out.println("enter the array elements :");
        
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(arraySortedOrNot(arr));
    }    
}
