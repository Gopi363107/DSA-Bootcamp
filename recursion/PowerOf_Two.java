public class PowerOf_Two {
    public static boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        if(n == 1) return true;
        if(n % 2 != 0) return false;
        return isPowerOfTwo(n / 2);
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));  // true
        System.out.println(isPowerOfTwo(18));  // false
    }
}


