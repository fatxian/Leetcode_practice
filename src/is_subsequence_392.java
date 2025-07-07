public class is_subsequence_392 {
    public boolean isSubsequence(String s, String t) {
        int left = 0;
        int right = 0;
        if (s.isEmpty())
            return true;
        while (left < s.length() && right < t.length()) {
            if (s.charAt(left) == t.charAt(right)) {
                left++;
                right++;
            }else if (s.charAt(left) != t.charAt(right)) {
                right++;
            }
        }
        if (left == s.length()) {
            return true;
        } else {
            return false;
        }
    }

//    public boolean isSubsequence(String s, String t) {
//        int i = 0, j = 0;
//
//        while (i < s.length() && j < t.length()) {
//            if (s.charAt(i) == t.charAt(j)) {
//                i++;
//            }
//            j++;
//        }
//
//        return i == s.length();
//    }
}
