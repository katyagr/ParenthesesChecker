import java.util.Stack;

public class ParenthesesChecker {

    private Stack<String> parentheses;

    public ParenthesesChecker(){
        this.parentheses = new Stack<>();
    }

    public void newLeftParenthesis(){
        parentheses.push("(");
    }

    public void newRightParenthesis(){
        if (parentheses.size() == 0) {
            parentheses.push("fail");
        } else if (parentheses.peek() == "(") {
            parentheses.pop();
        } else {
            parentheses.push("fail");
        }
    }

    public void newLeftAngle(){
        parentheses.push("<");
    }

    public void newRightAngle(){
        if (parentheses.size() == 0) {
            parentheses.push("fail");
        } else if (parentheses.peek() == "<") {
            parentheses.pop();
        } else {
            parentheses.push("fail");
        }
    }

    public void newLeftBrace(){
        parentheses.push("{");
    }

    public void newRightBrace(){
        if (parentheses.size() == 0) {
            parentheses.push("fail");
        } else if (parentheses.peek() == "{") {
            parentheses.pop();
        } else {
            parentheses.push("fail");
        }
    }

    public void newLeftSquare(){
        parentheses.push("[");
    }

    public void newRightSquare(){
        if (parentheses.size() == 0) {
            parentheses.push("fail");
        } else if (parentheses.peek() == "[") {
            parentheses.pop();
        } else {
            parentheses.push("fail");
        }
    }

    public void loopThroughString(String str){
        for (char c : str.toCharArray()) {
            if (c == '(') {
                this.newLeftParenthesis();
            } else if (c == ')') {
                this.newRightParenthesis();
            } else if (c == '<') {
                this.newLeftAngle();
            } else if (c == '>') {
                this.newRightAngle();
            } else if (c == '{') {
                this.newLeftBrace();
            } else if (c == '}') {
                this.newRightBrace();
            } else if (c == '[') {
                this.newLeftSquare();
            } else if (c == ']') {
                this.newRightSquare();
            }
        }
    }

    public boolean checkParentheses(String string) {
        this.loopThroughString(string);
        if (parentheses.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

}
