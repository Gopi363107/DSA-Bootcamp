public class ReverseInteger {
    public int reverse(int x) {
        long rev = 0;
        while (x != 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x = x / 10;
        }
        // Check for overflow
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
            return 0;
        return (int) rev;
    }

    public static void main(String[] args) {
        ReverseInteger obj = new ReverseInteger();
        int x = 123;
        System.out.println("Reversed Integer: " + obj.reverse(x));
    }
}

