public class valid_palindrome_125 {
    public boolean isPalindrome(String s) {
        StringBuilder ans = new StringBuilder();
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                ans.append(s.charAt(i));
            }
            if(s.charAt(i) >= 48 && s.charAt(i) <= 57){
                ans.append(s.charAt(i));
            }
        }
        String a = ans.toString();
        String r = ans.reverse().toString();
        if (a.equals(r)) {
            return true;
        } else {
            return false;
        }
    }

//    public boolean isPalindrome(String s) {
//        StringBuilder ans = new StringBuilder();
//        s = s.toLowerCase();
//
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (Character.isLetterOrDigit(c)) {
//                ans.append(c);
//            }
//        }
//
//        String a = ans.toString();
//        String r = new StringBuilder(a).reverse().toString();  // 避免原本的 ans 被改掉
//        return a.equals(r);
//    }


//    public boolean isPalindrome(String s) {
//        s = s.toLowerCase();
//        int left = 0, right = s.length() - 1;
//
//        while (left < right) {
//            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
//                left++;
//            }
//            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
//                right--;
//            }
//            if (s.charAt(left) != s.charAt(right)) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//
//        return true;
//    }
}
