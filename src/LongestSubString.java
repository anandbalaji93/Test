import java.util.*;

public class LongestSubString {
    public static void main(String[] args) {
        String s = "abcdbcdbafbdcbadbacad";
//        char[] ch = s.toCharArray();
//        String output = "";
//        for(int i=0;i<ch.length;i++) {
//            Set<Character> result = new HashSet<>();
//             int j=i;
//            for (; j < ch.length; j++) {
//                if (!result.contains(ch[j])) {
//                    result.add(ch[j]);
//                } else
//                    break;
//        }
//            if (output.length() < j - i + 1) {
//                output = s.substring(i, j);
//           }
//        }
//        System.out.println(output);
//Sliding Window Pattern
Map<Character, Integer> visited = new HashMap<>();
String output1
        = "";

for(int start=0,end=0;end<s.length();end++) {
    char currchar = s.charAt(start);
    if(visited.containsKey(currchar)) {
        start = Math.max(visited.get(currchar) + 1, start);
    }
    if(output1.length() < end-start+1) {
        output1 = s.substring(start,end+1 );
    }
    visited.put(currchar, end);
}
        System.out.println("Outputn striong is "+ output1);

    }
}
