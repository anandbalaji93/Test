public class LongestPalindromicSubSequence {

    public int longPalindromSSTD(String s, int start, int end, Integer[][] arr) {
        if(start == end)
            return 1;
        if(start > end)
            return 0;
        if(arr[start][end] == null) {
            if(s.charAt(start) == s.charAt(end)) {
                arr[start][end] = 2 + longPalindromSSTD(s, start+1,end-1,arr);
            }
            else {
                arr[start][end] = Math.max(longPalindromSSTD(s,start,end-1,arr),longPalindromSSTD(s,start+1,end,arr));
            }
        }
        return arr[start][end];
    }

    public static  void main(String[] args) {
        String s  = "ababdefab";
        LongestPalindromicSubSequence ls = new LongestPalindromicSubSequence();
        Integer[][] arr = new Integer[s.length()][s.length()];
        System.out.println(ls.longPalindromSSTD(s,0,s.length()-1,arr));
    }
}
