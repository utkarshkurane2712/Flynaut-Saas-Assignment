package assignments.june11;

public class OperatorPrecedence {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 20;

        // Operator precedence:
        // * and / are evaluated first, left to right
        // Then + and -, also left to right
        // Expression: a * b + c / 5 - b
        // Steps:
        // a * b = 10 * 5 = 50
        // c / 5 = 20 / 5 = 4
        // So: result = 50 + 4 - 5 = 49

        int result = a * b + c / 5 - b;
        System.out.println(result);
    }
}
