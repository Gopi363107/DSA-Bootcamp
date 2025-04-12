public class stock_buy_sell {
    public static int stock(int[]arr){
        int maxpro = 0;
        for (int i = 0; i < arr.length; i++) {
           for (int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]){
                    maxpro =Math.max( arr[j] - arr[i],maxpro);
                }
           } 
        }
        return maxpro;
    }
    static int stock_sell(int [] arr){
        int maxpro = 0;
        int minpro = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            minpro = Math.min(minpro,arr[i]);
            maxpro = Math.max(maxpro,arr[i]-minpro);
        }
        return maxpro;
    }

    public static void main(String args[]){
        int[] arr = {1,4,6,3,8,0,2};
        System.out.println("your maximum stock value : "+stock(arr));
        System.out.println("your maximum stock value : "+stock_sell(arr));
    }
}
