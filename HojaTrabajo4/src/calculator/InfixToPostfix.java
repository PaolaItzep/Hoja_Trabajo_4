package calculator;

import stack.Stack;

public class InfixToPostfix {

    private Stack<Character> stack;

    public InfixToPostfix(Stack<Character> stack) {
        this.stack = stack;
    }

    public String convert(String infix) {

        StringBuilder postfix = new StringBuilder();
        int i = 0;

        while (i < infix.length()) {

            char ch = infix.charAt(i);

            // Ignorar espacios
            if (Character.isWhitespace(ch)) {
                i++;
                continue;
            }

            // Si es número (puede tener varios dígitos)
            if (Character.isDigit(ch)) {

                while (i < infix.length() && Character.isDigit(infix.charAt(i))) {
                    postfix.append(infix.charAt(i));
                    i++;
                }

                postfix.append(" ");
                continue;
            }

            // Si es '('
            if (ch == '(') {
                stack.push(ch);
            }

            // Si es ')'
            else if (ch == ')') {

                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop()).append(" ");
                }

                if (!stack.isEmpty()) {
                    stack.pop(); // eliminar '('
                }
            }

            // Si es operador
            else {

                while (!stack.isEmpty() &&
                        precedence(ch) <= precedence(stack.peek())) {

                    postfix.append(stack.pop()).append(" ");
                }

                stack.push(ch);
            }

            i++;
        }

        // Vaciar pila
        while (!stack.isEmpty()) {
            postfix.append(stack.pop()).append(" ");
        }

        return postfix.toString().trim();
    }

    private int precedence(char operator) {

        switch (operator) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            default:
                return -1;
        }
    }
}