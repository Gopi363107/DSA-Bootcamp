//find missing number in an array (3 ways solved)

import java.util.Scanner;

public class missingnumber {
 
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
 
    
    static int MissingNumberFind(int[] arr){
        int xor1=0;
        int xor2=0;
        int n=arr.length+1;
        
        for(int i=0;i<n-1;i++){
            xor2^=arr[i];
        }
        for(int i=1;i<=n;i++){
            xor1^=i; 
        }
        return xor1^xor2; 
    }

    
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
        sc.close();
    }

}
