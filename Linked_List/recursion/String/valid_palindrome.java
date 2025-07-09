class valid_palindrome {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int i = 0, j = s.length() - 1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(isPalindrome("race a car")); // false
    }
}
