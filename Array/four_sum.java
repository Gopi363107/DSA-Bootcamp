//4 sum || find quads that add up to a target value
import java.util.*;

public class four_sum {
    static List<List<Integer>> brute_force(int[] arr,int target ){
        Set<List<Integer>> set = new HashSet<>();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int j2 = j+1; j2 < arr.length; j2++) {
                    for (int k = j2+1; k < arr.length; k++) {
                        sum = arr[i] + arr[j] ;
                        sum += arr[j2];
                        sum += arr[k];

                        if(sum == target){
                            List<Integer> temp = Arrays.asList(arr[i] , arr[j] , arr[j2], arr[k]);
                            Collections.sort(temp);
                            set.add(temp);
                        }

                    
                    }
                } 
            }
        }
        List<List<Integer>> ans =  new ArrayList<>(set);
        return ans;
    }

    static List<List<Integer>> better_approach(int [] arr,int target){
        Set<List<Integer>> set = new HashSet<>();
        

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                Set<Long>  hashset = new HashSet<>();
                for (int j2 = j+1; j2 < arr.length; j2++) {
                    long sum = arr[i] + arr[j];
                    sum += arr[j2];
                    long fourth = target - sum ;
                    if(hashset.contains(fourth)){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[j2]);
                        temp.add((int)fourth);
                        temp.sort(Integer :: compareTo);
                        set.add(temp);
                    }
                    hashset.add((long) arr[j2]);
                    
                }
            }
        }
        List<List<Integer>> ans1 =  new ArrayList<>(set);
        return ans1;
    }

    public static List<List<Integer>> optimal_approach(int[] arr,int target){
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if(i >  0 && arr[i] == arr[i-1]) continue;
            for (int j = i+1; j < arr.length; j++) {
                if(j > i+1 && arr[j] == arr[j-1]) continue;

                int k = j+1 ;
                int l = arr.length-1 ;
                while(k < l){
                    long sum = arr[i];
                    sum += arr[j] ;
                    sum += arr[k] ;
                    sum += arr[l] ;
                    if(sum == target){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.add(arr[l]);
                        ans.add(temp);
                        k++;
                        l--;

                        while(k < l && arr[k] == arr[k-1]) k++;
                        while(k < l && arr[l] == arr[l+1]) l--;   
                    }
                    else if (sum < target) k++ ;
                    else l--;
                }

                
            }
        }
        return ans;

    }
    public static void main(String [] args){
        int[] arr = {1,0,-1,0,-2,2};
        int target = 0;
        List<List<Integer>> ans = brute_force(arr,target);
        
        System.out.println("the quadruplets are :");
        for(List<Integer> it : ans){
            System.out.print("[");
            for( int ele : it){
                System.out.print(ele +" ");
            }
            System.out.print("]");
            System.out.println();
        }
        System.out.println();
        List<List<Integer>> ans1 = better_approach(arr,target);

        System.out.println("the quadruplets are :");
        for(List<Integer> it : ans1){
            System.out.print("[");
            for( int ele : it){
                System.out.print(ele +" ");
            }
            System.out.print("]");
            System.out.println();
        }
        System.out.println();
        List<List<Integer>> ans2 = optimal_approach(arr,target);

        System.out.println("the quadruplets are :");
        for(List<Integer> it : ans2){
            System.out.print("[");
            for( int ele : it){
                System.out.print(ele +" ");
            }
            System.out.print("]");
            System.out.println();
        }
        System.out.println();
    }
    
}
