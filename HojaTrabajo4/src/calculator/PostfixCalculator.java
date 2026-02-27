package calculator;

import stack.Stack;

public class PostfixCalculator {

    private Stack<Integer> stack;

    public PostfixCalculator(Stack<Integer> stack) {
        this.stack = stack;
    }

    public int evaluate(String postfix) {

        String[] tokens = postfix.split(" ");

        for (String token : tokens) {

            if (isNumber(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                int result = operate(a, b, token);
                stack.push(result);
            }
        }

        return stack.pop();
    }

    private boolean isNumber(String s) {
        return s.matches("\\d+");
    }

    private int operate(int a, int b, String operator) {

        switch (operator) {
            case "+":
                return a + b;

            case "-":
                return a - b;

            case "*":
                return a * b;

            case "/":
                if (b == 0)
                    throw new ArithmeticException("División entre cero");
                return a / b;

            default:
                throw new IllegalArgumentException("Operador inválido");
        }
    }
}