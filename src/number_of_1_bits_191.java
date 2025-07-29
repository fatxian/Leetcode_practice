public class number_of_1_bits_191 {
    public int hammingWeight(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n >>>= 1;
        }
        return count;
    }
//    public int hammingWeight(int n) {
//        int count = 0;
//        for (int i = 0; i < 32; i++) {
//            count += (n & 1);
//            n >>>= 1; // 無符號右移
//        }
//        return count;
//    }

//    public int hammingWeight(int n) {
//        int count = 0;
//        while (n != 0) {
//            n &= (n - 1); // 每次移除一個 1
//            count++;
//        }
//        return count;
//    }
}
