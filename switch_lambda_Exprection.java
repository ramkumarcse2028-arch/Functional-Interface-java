

public class switch_lambda_Exprection {
    public static void main(String[] args) {
        // first Method
       /* String op = "*";

        Operation operation = switch (op) {
            case "+" -> (a, b) -> a + b;
            case "-" -> (a, b) -> a - b;
            case "*" -> (a, b) -> a * b;
            case "/" -> (a, b) -> a / b;
            default -> throw new IllegalArgumentException("Invalid Operation");
        };

        System.out.println(operation.apply(10, 5));  */

        // Second Method 
        String op = "*";
        Operation operation;

        switch (op) {
            case "+":
                operation = (a, b) -> a + b;
                break;

            case "-":
                operation = (a, b) -> a - b;
                break;

            case "*":
                operation = (a, b) -> a * b;
                break;

            case "/":
                operation = (a, b) -> a / b;
                break;

            default:
                throw new IllegalArgumentException("Invalid Operation");
        }

        System.out.println(operation.apply(10, 5));
    }
}
// ye comman hai dono method me rahega
@FunctionalInterface
interface Operation {
    int apply(int a, int b);
}
