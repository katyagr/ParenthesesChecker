import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> test = new Stack<>();
        test.push("(");
        System.out.println(test.peek() == "(");
    }
}
