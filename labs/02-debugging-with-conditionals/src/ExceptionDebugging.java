public class ExceptionDebugging {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        try {
            int result = num1 / num2;
            System.out.println(result);
        }
        catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }
}