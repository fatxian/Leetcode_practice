import java.util.HashSet;

public class happy_number_202 {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (n != 1) {
            if (set.contains(n))
                return false;
            set.add(n);
            int sum = 0;
            while (n > 0) {
                sum = sum + (n % 10) * (n % 10);
                n = n / 10;
            }
            n = sum;
        }
        return true;
    }

//    public boolean isHappy(int n) {
//        Set<Integer> seen = new HashSet<>();
//
//        while (n != 1 && !seen.contains(n)) {
//            seen.add(n);
//            n = getNext(n);
//        }
//
//        return n == 1;
//    }
//
//    private int getNext(int n) {
//        int sum = 0;
//        while (n > 0) {
//            int digit = n % 10;
//            sum += digit * digit;
//            n /= 10;
//        }
//        return sum;
//    }

//    public boolean isHappy(int n) {
//        int slow = n;
//        int fast = getNext(n);
//
//        while (slow != fast) {
//            slow = getNext(slow);
//            fast = getNext(getNext(fast));
//        }
//
//        return slow == 1;
//    }
//
//    private int getNext(int n) {
//        int sum = 0;
//        while (n > 0) {
//            int digit = n % 10;
//            sum += digit * digit;
//            n /= 10;
//        }
//        return sum;
//    }
}
