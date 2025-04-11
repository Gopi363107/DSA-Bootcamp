import java.util.Scanner;

public class sum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        //get input from user
        System.out.println("enter the element in an array :");
        int [] arr=new int[3];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        //main logic
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }

        System.out.println("sum of the array element is "+sum);

        sc.close();
    }
    
}
