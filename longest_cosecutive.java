import java.util.*;
public class longest_cosecutive {
    public static int longest_array(int[] arr,int n){
        int longest = 1;
        Arrays.sort(arr);
        int last_smaller =Integer.MIN_VALUE;
        if(n==0){
            return 0;
        }
        int cnt=0;
        for (int i = 0; i < n; i++) {
            if(arr[i] -1 == last_smaller){
                cnt +=1;
                last_smaller = arr[i];

            }
            else if(arr[i] != last_smaller){
                cnt =1;
                last_smaller=arr[i];
            }
            longest = Math.max(longest,cnt);
            
        }
        return longest;

    }

    public static void main(String args[]){
        int[] arr={1,2,4,3,100,101,102};
        int n= arr.length;
        int ans = longest_array(arr,n);
        System.out.println("the longest consecutive sequence is "+ans);
    }
    
}
