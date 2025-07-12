//Intersection of two sorted arrays

import java.util.ArrayList;
import java.util.Scanner;


public class intersectionofarray {
    //optimal approach
    public static ArrayList<Integer> IntersectionofArray(int [] a,int [] b){

        //create array list
        ArrayList<Integer> ans = new ArrayList<>();

        int i=0;int j=0;
        while(i<a.length && j<b.length){

            if(a[i] < b[j]){
                i++;
            }
            else if(b[j] < a[i]){
                j++;
            }else{
                ans.add(a[i]);
                i++;
                j++;
            }
        }

        return ans;

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

        for(int j=0;j<n2;j++){
            b[j]=sc.nextInt();
        }
        ArrayList<Integer> ans=IntersectionofArray(a ,b );

        System.out.println("Intersection of two arrays :"); 

        for(int i = 0; i < ans.size();i++){
            System.out.print( ans.get(i) +" ");
        }
        sc.close();    
    }
}
