import java.util.HashMap;

public class contains_duplicate_II_219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            }else if(Math.abs(map.get(nums[i]) - i) <= k){
                return true;
            }else if (Math.abs(map.get(nums[i]) - i) > k) {
                map.put(nums[i],i);
            }
        }
        return false;
    }

//    public boolean containsNearbyDuplicate(int[] nums, int k) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            if (map.containsKey(nums[i])) {
//                int prevIndex = map.get(nums[i]);
//                if (i - prevIndex <= k) {
//                    return true;
//                }
//            }
//            // 更新目前這個值最新的 index
//            map.put(nums[i], i);
//        }
//
//        return false;
//    }

//    public boolean containsNearbyDuplicate(int[] nums, int k) {
//        Set<Integer> seen = new HashSet<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            if (i > k) {
//                seen.remove(nums[i - k - 1]);
//            }
//
//            if (seen.contains(nums[i])) {
//                return true;
//            }
//
//            seen.add(nums[i]);
//        }
//
//        return false;
//    }
}
