import java.util.HashMap;

public class ransom_note_383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> a = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            a.put(magazine.charAt(i), a.getOrDefault(magazine.charAt(i), 0) + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (a.containsKey(ransomNote.charAt(i))) {
                a.put(ransomNote.charAt(i), a.get(ransomNote.charAt(i)) - 1);
            }
            if (!a.containsKey(ransomNote.charAt(i)) || a.get(ransomNote.charAt(i)) < 0) {
                return false;
            }
        }
        return true;
    }

//    public boolean canConstruct(String ransomNote, String magazine) {
//        Map<Character, Integer> count = new HashMap<>();
//
//        for (char c : magazine.toCharArray()) {
//            count.put(c, count.getOrDefault(c, 0) + 1);
//        }
//
//        for (char c : ransomNote.toCharArray()) {
//            if (!count.containsKey(c) || count.get(c) == 0) {
//                return false;
//            }
//            count.put(c, count.get(c) - 1);
//        }
//
//        return true;
//    }

//    public boolean canConstruct(String ransomNote, String magazine) {
//        int[] count = new int[26];
//
//        for (char c : magazine.toCharArray()) {
//            count[c - 'a']++;
//        }
//
//        for (char c : ransomNote.toCharArray()) {
//            if (--count[c - 'a'] < 0) {
//                return false;
//            }
//        }
//
//        return true;
//    }
}
