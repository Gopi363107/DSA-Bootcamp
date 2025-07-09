public class length_OfLastWord {
    public static int lengthOfLastWord(String s) {
        int cnt = 0;
        s = s.trim();
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == ' ') break;
            cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));  // 5
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));  // 4
    }    

}
