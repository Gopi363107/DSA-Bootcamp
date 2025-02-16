//find missing number in an array (3 ways solved)

import java.util.Scanner;
import java.util.Arrays;

public class missingnumber {



    //native approach brude force solution  TC O(N^2) SC O(1)
    /*this idea is to use two nested loops ,where the outer one iterate from 1 to n and inner loop iterate each of the array arr[] 
     * elements,if the value in outer loop in not value ,else iterate to next value
     */  
    static int MissingNumber(int[] arr){
       int n=arr.length+1;
       for(int i=1;i<=n;i++){ //it return i value
            boolean found=false;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==i){
                    found=true;
                    break;
                }
            }
            if(!found){
                return i;
            }    
        } 
        return -1;
            
    } 
    
    //better approach
    //using hashing -o(n) tc o(n) sc
    //this idea is to use an auxilary array hash[] to store the frequency of each element in thegiven array arr[]. the number with frequency o is the missing number.

    static int missingnumberusinghash(int [] arr){
        //create hash array of size n+1
        int n=arr.length+1;
        int[] hash=new int[n+1];

        //store frequencies of elements in the created hash map
        for(int i=0;i<n-1;i++){
            hash[arr[i]]++;
        }

        //find the missing number
        for(int i=1;i<=n;i++){
            if(hash[i]==0){
                return i;
            }
        }
        return -1;
    }
 
    //optimal approach 
    //time complexity -O(N)
    //SPACE COMPLEXITY-O(1)
    static int MissingNumberFind(int[] arr){
        int xor1=0;
        int xor2=0;
        int n=arr.length+1;//example we take arr.length=6 n=6+1=7    arr={1,2,4,5,3,7}
        
        for(int i=0;i<n-1;i++){//i runs 0 to 6  0^0=0 2^2=2 0^2=2
            xor2^=arr[i];//0=0^1 0=0^2 0=0^3 0=0^4 0=0^5 0=0^7     xor2 stores given array xor2={1 2 3 4 5 7} 
        }
        for(int i=1;i<=n;i++){// i runs 1 to 7
            xor1^=i; // 0=0^1 0=0^2 0=0^3 0=0^4 0=0^5 0=0^6 0=0^7 xor1 stores the actual iterative value xor1={1,2,3,4,5,6,7}
        }
        return xor1^xor2; //then xor1^xor2  1^1=0 2^2=0 3^3=0 4^4=0 5^5=0 7^7=0 6 is an separete value so the answer is 6...
    }

    //optimal approach
    //using sum of n terms formula-o(n) time o(1)space
    // the sum of first n natural is given by the formula (n*(n+1))/2.
    //this idea is to compute this sum and subtract the sum of all elements in the array from it to get the missing number

    static int missingnumbersumn(int []arr){
        int n=arr.length+1;
        //calculate the summ of array
        int sum=0;
        for(int i=0;i<n-1;i++){
            sum=sum+arr[i];
        }
        //calcute the expected sum 
        int expectedsum=(n*(n+1))/2;

        return expectedsum-sum;

    }

    //main function
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the value of n");
        int n=sc.nextInt();

        System.out.println("enter the elements for array :");
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("BRUDE FORCE APPROACH");
        System.out.println(MissingNumber(arr));
        System.out.println("BETTER APPROACH");
        System.out.println(missingnumberusinghash(arr));
        System.out.println("OPTIMAL OPPROACH -1");
        System.out.println(MissingNumberFind(arr));
        System.out.println("OPTIMAL APPROACH -2");
        System.out.println(missingnumbersumn(arr));
    }

}
