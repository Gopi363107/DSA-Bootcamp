//majority element >n/2 times
public class majority_element {
    
    static int majority(int[] arr,int n){
        int cnt =0 ;
        int el =0;
        for (int i = 0; i < n; i++) {
            if(cnt ==0){
                cnt =1;
                el = arr[i];

            }
            else if(el ==arr[i]) cnt++;
            else cnt--;
        }

        int cnt1=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==el) cnt1++;
        }
        if(cnt1>(n/2)) return  el;
        return -1;
    }

    
    public static void main(String args[]){
        int[] arr = {1,2,2,2,10,2,10,10};
        int n = arr.length;
        System.out.print(majority(arr,n));
    } 
    
}
