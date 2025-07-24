import java.util.Stack;

public class valid_parentheses_20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.length() % 2 != 0)
            return false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else if (stack.empty()) {
                return false;
            } else if (s.charAt(i) == ')') {
                if (stack.pop() != '(')
                    return false;
            } else if (s.charAt(i) == '}') {
                if (stack.pop() != '{')
                    return false;
            } else if (s.charAt(i) == ']') {
                if (stack.pop() != '[')
                    return false;
            }
        }
        if (stack.empty())
            return true;
        return false;
    }

//    public boolean isValid(String s) {
//        Stack<Character> stack = new Stack<>();
//
//        for (char c : s.toCharArray()) {
//            // 遇到開括號就推進去
//            if (c == '(' || c == '{' || c == '[') {
//                stack.push(c);
//            } else {
//                // 沒有對應的開括號就 false
//                if (stack.isEmpty()) return false;
//
//                // 檢查是否匹配
//                char top = stack.pop();
//                if ((c == ')' && top != '(') ||
//                        (c == '}' && top != '{') ||
//                        (c == ']' && top != '[')) {
//                    return false;
//                }
//            }
//        }
//
//        // 最後 Stack 要是空的才是正確配對
//        return stack.isEmpty();
//    }

//    public boolean isValid(String s) {
//        Stack<Character> stack = new Stack<>();
//        Map<Character, Character> map = new HashMap<>();
//        map.put(')', '(');
//        map.put('}', '{');
//        map.put(']', '[');
//
//        for (char c : s.toCharArray()) {
//            if (map.containsValue(c)) {
//                stack.push(c); // 是開括號
//            } else if (map.containsKey(c)) {
//                if (stack.isEmpty() || stack.pop() != map.get(c)) {
//                    return false;
//                }
//            }
//        }
//
//        return stack.isEmpty();
//    }
}
