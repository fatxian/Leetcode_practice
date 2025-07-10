import java.util.ArrayList;
import java.util.HashMap;

public class word_pattern_290 {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        ArrayList<String> stringArray = new ArrayList<>();
        s = s + " ";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                stringArray.add(s.substring(0, i));
                s = s.substring(i + 1, s.length());
                i = 0;
            }
        }
        if (pattern.length() != stringArray.size())
            return false;
        for (int i = 0; i < pattern.length(); i++) {
            if (!map.containsKey(pattern.charAt(i))) {
                if (map.containsValue(stringArray.get(i))) {
                    return false;
                }
                map.put(pattern.charAt(i), stringArray.get(i));

            } else {
                if (!map.get(pattern.charAt(i)).equals(stringArray.get(i))) {
                    return false;
                }
            }
        }
        return true;
    }

//    public boolean wordPattern(String pattern, String s) {
//        String[] words = s.split(" ");
//        if (pattern.length() != words.length) return false;
//
//        Map<Character, String> map = new HashMap<>();
//        Set<String> seen = new HashSet<>();
//
//        for (int i = 0; i < pattern.length(); i++) {
//            char c = pattern.charAt(i);
//            String word = words[i];
//
//            if (map.containsKey(c)) {
//                if (!map.get(c).equals(word)) return false;
//            } else {
//                if (seen.contains(word)) return false; // 已經有其他字母映射這個字了
//                map.put(c, word);
//                seen.add(word);
//            }
//        }
//
//        return true;
//    }
}
