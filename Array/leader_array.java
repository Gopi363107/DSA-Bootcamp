import java.util.*;
public class leader_array {
    public static ArrayList<Integer> leadersinan_array(int[] arr,int n){
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boolean leader = true;
            for (int j = i+1; j < n; j++) {
                if (arr[j]  > arr[i]){
                    leader = false ;
                    break;
                }
            }
            if(leader)
              ans.add(arr[i]);
        }
        return ans;
    }

    public static ArrayList<Integer> leaders_of_array(int [] arr,int n){
        ArrayList<Integer> ans1 = new ArrayList<>();

        int maxi = arr[n-1];
        ans1.add(arr[n-1]);
        for (int i = n-2; i >= 0; i--) {
            if(arr[i] > maxi){
                ans1.add(arr[i]);
                maxi = arr[i];
            }
        }
        return ans1;
    }

    public static void main(String args[]){
        int[] arr={12,3,9,6,4};
        int n = arr.length;
        ArrayList<Integer> ans = leadersinan_array(arr, n);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
        ArrayList<Integer> ans1 = leaders_of_array(arr, n);
        for(int i = 0 ;i<ans1.size();i++){
            System.out.print(ans1.get(i)+" ");
        }
    }
    
}
