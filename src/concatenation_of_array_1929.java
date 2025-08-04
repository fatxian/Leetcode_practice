public class concatenation_of_array_1929 {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] newArr = new int[2*length];
        for(int i = 0; i < length; i++) {
            newArr[i] = nums[i];
            newArr[i+length] = nums[i];
        }
        return newArr;
    }
}
