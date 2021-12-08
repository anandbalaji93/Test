public class LongestPalindromiSubString {

    public int lpSubString (String str,int start, int end){
        if(start > end)
            return 0;
        if(start == end)
            return 1;
        if (str.charAt(start) == str.charAt(end)) {
            int lpsRemaining = end-start-1;
        if(lpsRemaining == lpSubString(str,start+1,end-1)) {
           return 2 + lpsRemaining;
        }
    }
        return Math.max(lpSubString(str, start+1,end), lpSubString(str,start,end-1));
}

public int lpSubStringTopBottom(String str, int start, int end, Integer[][] arr) {
        if(start > end)
            return 0;
        if(start == end)
            return 1;
        if(arr[start][end] == null) {
            if(str.charAt(start) == str.charAt(end)) {
                int lpsremaining = end-start-1;
                if(lpsremaining == lpSubStringTopBottom(str,start+1,end-1,arr))
                    arr[start][end] = 2 + lpsremaining;

            }
            else{
                arr[start][end] = Math.max(lpSubStringTopBottom(str,start,end-1,arr), lpSubStringTopBottom(str, start+1,end,arr));
            }

        }
    return arr[start][end];

}
    public static void main(String[] args) {
    LongestPalindromiSubString lp = new LongestPalindromiSubString();
    String s = "babad";
    System.out.println(lp.lpSubString(s,0,s.length()-1));
    Integer[][] arr = new Integer[s.length()][s.length()];
    System.out.println(lp.lpSubStringTopBottom(s, 0, s.length()-1,arr));
    }
}