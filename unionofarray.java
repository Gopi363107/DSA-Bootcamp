//find the union of array
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;


public class unionofarray {

    //main logic
    public static ArrayList<Integer> setunion(int [] a,int [] b, int n,int m){
        int i=0;
        int j=0;

        //create array list
        ArrayList<Integer> union=new ArrayList<>();

        while(i < n && j < m){
            if(a[i] <= b[j]){
                if(union.size() == 0 || union.get(union.size()-1) != a[i] )
                    union.add(a[i]);
                i++;        
            }
            else{
                if(union.size() == 0 || union.get(union.size()-1) != b[j] )
                  union.add(b[j]);
                j++;  
            }
        }

        while(i<n){
            if(union.get(union.size()-1) != a[i])
              union.add(a[i]);
            i++; 
        }

        while(j<m){
            if(union.size() == 0 || union.get(union.size()-1) != b[j] )
              union.add(b[j]);
            j++; 
        }

        return union;
    }


    //main function

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        //get n,m value from the user
        System.out.println("enter tne n value :");
        int n=sc.nextInt();

        System.out.println("enter the m value :");
        int m=sc.nextInt();

        System.out.println("enter the values for array a :");
        int[] a=new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the values for array b :");
        int[] b=new int[m];

        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        ArrayList<Integer> union=setunion(a ,b ,n ,m );
        System.out.println("union of two sorted array :");
        for(int num:union){
            System.out.print( num +" ");
        }
            
    }

    
}
