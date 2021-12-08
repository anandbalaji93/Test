/*Input: str = "4325043", n = 3
Output: "2043"*/

import java.util.Stack;

public class LowestNumberRemoval {
public static String removeKDigits(String s, int n) {
    StringBuilder sb  = new StringBuilder();
    if(n==0)
        return s;
    if(n>s.length())
        return "0";
    Stack<Character> st = new Stack<>();
    for(int i=0;i<s.length();i++) {
        char c = s.charAt(i);
        if (!st.isEmpty() && st.peek() > c && n > 0) {
            st.pop();
            n--;
        }
        if (!st.isEmpty() || c != '0')
            st.push(c);
    }
        while(!s.isEmpty() && n>0) {
            n--;
            st.pop();
        }
        if(st.isEmpty())
            return "0";
        while(!st.isEmpty())
            sb.append(st.pop());
        return sb.reverse().toString();
    }

public static void main(String[] args) {
    String s= "765028321";
    int k = 5;
    System.out.println(removeKDigits(s,5));
}

}
