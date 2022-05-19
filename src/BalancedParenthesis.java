import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
        String parentheses = "{[()]}";
        Stack<Character> parenthStack = new Stack<Character>();
        for(int i=0;i<parentheses.length();i++) {
            if(parentheses.charAt(i) == '{' || parentheses.charAt(i) == '[' || parentheses.charAt(i) == '(')
                parenthStack.push(parentheses.charAt(i));
            if(parentheses.charAt(i) == '}') {
                if (parenthStack.pop() != '{' || parenthStack.isEmpty()) {
                    System.out.println("False");
                    break;
                }
            }
             if(parentheses.charAt(i) == ']') {
                if (parenthStack.pop() != '[' || parenthStack.isEmpty()) {
                    System.out.println("False");
                    break;
                }
            }
             if(parentheses.charAt(i) == ')') {
                if (parenthStack.pop() == '(' || parenthStack.isEmpty()) {
                    System.out.println("False");
                    break;
                }
            }
            }
        }
    }
