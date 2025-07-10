import java.util.HashMap;

public class isomorphic_strings_205 {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> remap = new HashMap<>();
        if (s.length() != t.length())
            return false;
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), t.charAt(i));
            } else {
                if (map.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }
            if (!remap.containsKey(t.charAt(i))) {
                remap.put(t.charAt(i), s.charAt(i));
            } else {
                if (remap.get(t.charAt(i)) != s.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }

//    public boolean isIsomorphic(String s, String t) {
//        if (s.length() != t.length()) return false;
//
//        Map<Character, Character> map = new HashMap<>();
//        Map<Character, Character> reverseMap = new HashMap<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            char cs = s.charAt(i);
//            char ct = t.charAt(i);
//
//            if (map.containsKey(cs)) {
//                if (map.get(cs) != ct) return false;
//            } else {
//                map.put(cs, ct);
//            }
//
//            if (reverseMap.containsKey(ct)) {
//                if (reverseMap.get(ct) != cs) return false;
//            } else {
//                reverseMap.put(ct, cs);
//            }
//        }
//
//        return true;
//    }

//    public boolean isIsomorphic(String s, String t) {
//        HashMap<Character, Integer> charIndexS = new HashMap<>();
//        HashMap<Character, Integer> charIndexT = new HashMap<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            if (!charIndexS.containsKey(s.charAt(i))) {
//                charIndexS.put(s.charAt(i), i);
//            }
//
//            if (!charIndexT.containsKey(t.charAt(i))) {
//                charIndexT.put(t.charAt(i), i);
//            }
//
//            if (!charIndexS.get(s.charAt(i)).equals(charIndexT.get(t.charAt(i)))) {
//                return false;
//            }
//        }
//
//        return true;
//    }
}
