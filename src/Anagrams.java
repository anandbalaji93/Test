import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        Map<String, List<String>> listMap = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (!listMap.containsKey(key)) {
                listMap.put(key, new ArrayList<>());
            }
            listMap.get(key).add(str);
        }
        System.out.println(listMap.values());
    }
}
