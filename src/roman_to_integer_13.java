import java.util.HashMap;

public class roman_to_integer_13 {
    public int romanToInt(String s) {
        int output = 0;
        HashMap<Character, Integer> j = new HashMap<>();
        j.put('I', 1);
        j.put('V', 5);
        j.put('X', 10);
        j.put('L', 50);
        j.put('C', 100);
        j.put('D', 500);
        j.put('M', 1000);
        for (int i = 0; i < s.length() - 1; i++) {
            if (j.get(s.charAt(i)) < j.get(s.charAt(i+1))) {
                output -= j.get(s.charAt(i));
            } else {
                output += j.get(s.charAt(i));
            }
        }
        output += j.get(s.charAt(s.length()-1));
        return output;
    }
}
