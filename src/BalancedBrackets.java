public class BalancedBrackets {
    public static boolean isBalanced(String expression) {
        // Must be even
        if ((expression.length() % 2) != 0)
            return false;
        // Must start with an opening bracket
        if (expression.charAt(0) == '}' || expression.charAt(0) == ')' || expression.charAt(0) == ']')
            return false;
        // Must end with a closing bracket
        if (expression.charAt(expression.length() - 1) == '{' || expression.charAt(expression.length() - 1) == '(' || expression.charAt(expression.length() - 1) == '[')
            return false;
        // Create a stack
        Stack stack = new ArrayStack(expression.length());
        // Loop through the expression
        for (int i = 0; i < expression.length(); i++) {
            // If the character is an opening bracket, push it onto the stack
            if (expression.charAt(i) == '{' || expression.charAt(i) == '(' || expression.charAt(i) == '[')
                stack.push(expression.charAt(i));
            // If the character is a closing bracket, pop the stack and check if it matches
            if (expression.charAt(i) == '}' || expression.charAt(i) == ')' || expression.charAt(i) == ']') {
                // If the stack is empty, return false
                if (stack.isEmpty())
                    return false;
                // Pop the stack
                char popped = (char) stack.pop();
                // Check if the popped character matches the closing bracket
                if (expression.charAt(i) == '}' && popped != '{')
                    return false;
                if (expression.charAt(i) == ')' && popped != '(')
                    return false;
                if (expression.charAt(i) == ']' && popped != '[')
                    return false;
            }
        }
        // If the stack is not empty, return false
        if (!stack.isEmpty())
            return false;
        // If all the checks pass, return true
        return true;
    }
}
