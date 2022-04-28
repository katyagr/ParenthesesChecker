import java.util.Stack;

public class ParenthesesChecker {

    public boolean checkParentheses(String string) {
        Stack<String> parentheses = new Stack<>();
        for (char c : string.toCharArray()) {
            if (c == '(') {
                parentheses.push("(");
            } else if (c == ')') {
                if (parentheses.size() == 0) {
                    return false;
                } else if (parentheses.peek() == "(") {
                    parentheses.pop();
                } else {
                    return false;
                }
            } else if (c == '<') {
                parentheses.push("<");
            } else if (c == '>') {
                if (parentheses.size() == 0) {
                    return false;
                } else if (parentheses.peek() == "<") {
                    parentheses.pop();
                } else {
                    return false;
                }
            } else if (c == '{') {
                parentheses.push("{");
            } else if (c == '}') {
                if (parentheses.size() == 0) {
                    return false;
                } else if (parentheses.peek() == "{") {
                    parentheses.pop();
                } else {
                    return false;
                }
            } else if (c == '[') {
                parentheses.push("[");
            } else if (c == ']') {
                if (parentheses.size() == 0) {
                    return false;
                } else if (parentheses.peek() == "[") {
                    parentheses.pop();
                } else {
                    return false;
                }
            }
        }
        if (parentheses.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

}
