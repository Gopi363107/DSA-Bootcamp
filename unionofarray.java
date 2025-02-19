//find the union of array
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;


public class unionofarray {

    //main logic
    public static ArrayList<Integer> setunion(int [] a,int [] b){
        HashSet<Integer> st=new HashSet<>();
        //st means hashset put all the values in the hashset

        //put the all elements of a[] in st
        for(int num:a){
            st.add(num);
        }

        //put the all elements of b[] in st
        for(int num :b){
            st.add(num);
        }

        //create array list
        ArrayList<Integer> res=new ArrayList<>();

        for(int it:st){
            res.add(it);
        }

        return res;
    }


    //main function

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        //get n1,n2 value from the user
        System.out.println("enter tne n1 value :");
        int n1=sc.nextInt();

        System.out.println("enter the n2 value :");
        int n2=sc.nextInt();

        System.out.println("enter the values for array a :");
        int[] a=new int[n1];

        for(int i=0;i<n1;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the values for array b :");
        int[] b=new int[n2];

        for(int i=0;i<n1;i++){
            b[i]=sc.nextInt();
        }
        ArrayList<Integer> res=setunion(a ,b );
        for(int num:res){
            System.out.print( num +" ");
        }
            
    }

    
}
