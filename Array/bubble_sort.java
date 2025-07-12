//to sort using bubble sort 
//time complexity : O(N^2) N-->size of the array
//space complexity : O(1)
import java.util.Scanner;



public class bubble_sort {

    public static void sorted(int n, int[] arr){
        for (int i = n-1; i >= 0; i--) {
            for (int j = 0; j <= i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            
        }

        //to print the sorted array
        System.out.println("after sorting array :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //main function
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);

        //to get n value from user
        System.out.println("enter the value of n :");
        int n = sc.nextInt();

        //to get the array element for sorting 
        int[] arr =new int[n];
        System.out.println("enter the element to be stored in an array :");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();   
        }

        System.out.println("before sorting array :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sorted(n,arr);
        sc.close();
    }

    
}
