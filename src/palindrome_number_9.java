public class palindrome_number_9 {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        if (x < 10)
            return true;
        int z = x;
        int y = 0;
        while (z > 0) {
            y *= 10;
            y += z % 10;
            z /= 10;
        }
        return x == y;
    }
//    public boolean isPalindrome(int x) {
//        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
//
//        int reversed = 0;
//        int original = x;
//
//        while (x > 0) {
//            reversed = reversed * 10 + x % 10;
//            x /= 10;
//        }
//        return original == reversed;
//    }

//    public boolean isPalindrome(int x) {
//        // 負數 & 末尾 0 的非 0 數字必然不是回文
//        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
//
//        int reversedHalf = 0;
//        // 只反轉數字的一半
//        while (x > reversedHalf) {
//            reversedHalf = reversedHalf * 10 + x % 10;
//            x /= 10;
//        }
//        // 偶數位數：x == reversedHalf
//        // 奇數位數：x == reversedHalf/10 (去掉中間位)
//        return x == reversedHalf || x == reversedHalf / 10;
//    }
}
