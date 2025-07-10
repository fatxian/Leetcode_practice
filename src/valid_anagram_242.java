import java.util.HashMap;

public class valid_anagram_242 {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> k = new HashMap<>();
        if(s.length()!=t.length()) return false;
        for(int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            k.put(sc, k.getOrDefault(sc,0)+1);
        }
        for(int i = 0; i< t.length();i++){
            char tc = t.charAt(i);
            if(!k.containsKey(tc)) return false;
            k.put(tc, k.get(tc)-1);
            if(k.get(tc)<0) return false;
        }
        return true;
    }

//    public boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) return false;
//
//        int[] count = new int[26];  // a~z 對應 index 0~25
//
//        for (int i = 0; i < s.length(); i++) {
//            count[s.charAt(i) - 'a']++;  // s 字母 +1
//            count[t.charAt(i) - 'a']--;  // t 字母 -1
//        }
//
//        for (int n : count) {
//            if (n != 0) return false;  // 有差異就不是 anagram
//        }
//
//        return true;
//    }
}
