public class Task2 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        if (num1 != 0 && num2 != 0) {
            int result = num1 / num2;  // This will cause an ArithmeticException
        }

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 0, 16, 17, 18, 19, 20};
        int numerator = 40;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                System.out.println(numerator / numbers[i]);

            }
        }
    }
}
