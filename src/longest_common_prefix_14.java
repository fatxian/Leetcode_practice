public class longest_common_prefix_14 {
    public String longestCommonPrefix(String[] strs) {
        String answer = strs[0];
        for (int i = 1; i < strs.length; i++) {
            for (int j = 0; j < answer.length(); j++) {
                if (j >= strs[i].length()||answer.charAt(j) != strs[i].charAt(j)) {
                    answer = answer.substring(0, j);
                }
            }
        }
        return answer;
    }


//    class Solution {
//        public String longestCommonPrefix(String[] v) {
//            StringBuilder ans = new StringBuilder();
//            Arrays.sort(v);
//            String first = v[0];
//            String last = v[v.length-1];
//            for (int i=0; i<Math.min(first.length(), last.length()); i++) {
//                if (first.charAt(i) != last.charAt(i)) {
//                    return ans.toString();
//                }
//                ans.append(first.charAt(i));
//            }
//            return ans.toString();
//        }
//    }
}
