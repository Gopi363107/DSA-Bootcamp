//check if the array is sorted
import java.util.Arrays;
import java.util.Scanner;

public class sorted {

    // O(N) -O(1)
    //main logic
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(SortedOrNot(arr));
    } 

    //sub function
    static boolean SortedOrNot(int arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){

            }
            else{
                return false;
            }
        }
        return true;


    }
        
    
}
