import java.util.ArrayList;
import java.util.List;

public class summary_ranges_228 {
    public List<String> summaryRanges(int[] nums) {
        int first = 0;
        int last = 1;
        List<String> result = new ArrayList<>();
        if (nums.length == 1) {
            result.add(Integer.toString(nums[0]));
        }

        while (last < nums.length) {
            if (nums[last] - nums[last - 1] == 1) {
                last++;
            } else {
                if (first == last - 1) {
                    result.add(Integer.toString(nums[first]));
                } else {
                    result.add(Integer.toString(nums[first]) + "->" + Integer.toString(nums[last - 1]));
                }
                first = last;
                last++;
            }

            if (last == nums.length) {
                if (first == last - 1) {
                    result.add(Integer.toString(nums[first]));
                } else {
                    result.add(Integer.toString(nums[first]) + "->" + Integer.toString(nums[last - 1]));
                }

            }
        }
        return result;
    }

//    public List<String> summaryRanges(int[] nums) {
//        List<String> result = new ArrayList<>();
//        if (nums.length == 0) return result;
//
//        int start = 0;
//        for (int i = 1; i < nums.length; i++) {
//            // 如果不是連續，就處理前一段
//            if (nums[i] != nums[i - 1] + 1) {
//                if (start == i - 1) {
//                    result.add(String.valueOf(nums[start]));
//                } else {
//                    result.add(nums[start] + "->" + nums[i - 1]);
//                }
//                start = i;
//            }
//        }
//
//        // 處理最後一段
//        if (start == nums.length - 1) {
//            result.add(String.valueOf(nums[start]));
//        } else {
//            result.add(nums[start] + "->" + nums[nums.length - 1]);
//        }
//
//        return result;
//    }
}
