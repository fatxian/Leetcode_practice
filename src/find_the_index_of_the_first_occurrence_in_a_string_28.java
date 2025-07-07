public class find_the_index_of_the_first_occurrence_in_a_string_28 {
    public int strStr(String haystack, String needle) {
        int index = 0;
        if (haystack.length() < needle.length()) {
            return -1;
        }
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                index = i;
            }
            for (int j = index; j < needle.length() + index && j < haystack.length(); j++) {
                if (haystack.charAt(j) != needle.charAt(j - index)) {
                    break;

                }
                if (j == index + needle.length() - 1) {
                    return index;
                }
            }
        }
        return -1;
    }

//    public int strStr(String haystack, String needle) {
//        if (haystack.length() < needle.length()) {
//            return -1;
//        }
//
//        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
//            if (haystack.substring(i, i + needle.length()).equals(needle)) {
//                return i;
//            }
//        }
//
//        return -1;
//    }
}
