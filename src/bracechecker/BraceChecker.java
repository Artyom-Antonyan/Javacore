package bracechecker;

public class BraceChecker {

    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {

        Stack stack = new Stack();

        for (int i = 0; i < text.length(); i++) {

            char c = text.charAt(i);

            if (c == '(' || c == '[' || c == '{') {

                stack.push(c);

            }

            else if (c == ')' || c == ']' || c == '}') {

                if (stack.isEmpty()) {

                    System.out.println("Error: unexpected " + c + " at " + i);
                    return;
                }

                char opened = stack.pop();


                if ((opened == '(' && c != ')') ||
                        (opened == '[' && c != ']') ||
                        (opened == '{' && c != '}')) {

                    System.out.println("Error: opened " + opened +
                            " but closed " + c + " at " + i);

                    return;
                }

            }
        }

        if (!stack.isEmpty()) {

            char opened = stack.pop();

            System.out.println("Error: opened " + opened + " but not closed");

            return;
        }

        System.out.println("No errors");
    }

}
