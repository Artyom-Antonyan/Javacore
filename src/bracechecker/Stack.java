package bracechecker;

public class Stack {
    private char[] stack = new char[10];
    private int tos;

    public Stack() {
        tos = -1;
    }

    public void push(char item) {
        if (tos == stack.length - 1) {
            extend();
        }

        stack[++tos] = item;
    }

    public char pop() {
        if (tos < 0) {
            return 0;
        }

        return stack[tos--];
    }

    public boolean isEmpty() {
        return tos == -1;
    }

    private void extend() {
        char[] newStack = new char[stack.length + 10];

        for (int i = 0; i < stack.length; i++) {
            newStack[i] = stack[i];
        }

        stack = newStack;
    }
}