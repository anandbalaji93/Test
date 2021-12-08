import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class LengthofLongestSubString {
    public static void main(String[] args) {
        String s = "Hellothisisbala";
        char[] ch = s.toCharArray();
        int max=0;
        for(int i=0;i<ch.length;i++) {
            int sum = 0;
            List<Character> temp = new ArrayList<>();
            for(int j=i;j<ch.length;j++) {
                if(!temp.contains(ch[j])) {
                    temp.add(ch[j]);
                    sum++;
                }
                else
                    break;
            }
            max = Math.max(max,sum);
        }
        System.out.println(max);
    }
    }
