public class recur {
    
    static void numbers(int i , int n){
        if(i > n) return;

        numbers(i+1 , n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        int s=1;
        int e=3;
        numbers(s,e);
    }
    
}

