package leetcode;

public class L1021 {
    public String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (char c : S.toCharArray()) {
            if (c == '(' && count++ > 0) {
                sb.append(c);
            }
            if (c == ')' && count-- > 1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

