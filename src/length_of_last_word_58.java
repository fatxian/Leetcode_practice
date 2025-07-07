public class length_of_last_word_58 {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int output = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                output += 1;
            } else if (output != 0) {
                break;
            }
        }
        return output;
    }
}
