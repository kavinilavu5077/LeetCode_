

public class Solution {
    public String decodeString(String s) {
        Stack<Integer> num = new Stack<>();
        Stack<StringBuilder> str = new Stack<>();
        StringBuilder current = new StringBuilder();
        int number = 0;
        
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                number = number * 10 + (c - '0');
            } else if (c == '[') {
                num.push(number);
                str.push(current);
                current = new StringBuilder();
                number = 0;
            } else if (c == ']') {
                StringBuilder temp = current;
                current = str.pop();
                int repeatCount = num.pop();
                while (repeatCount-- > 0) {
                    current.append(temp);
                }
            } else {
                current.append(c);
            }
        }
        
        return current.toString();
    }
}
