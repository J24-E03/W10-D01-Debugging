public class LoopBug {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 1, 16, 17, 18, 19, 20};
        int numerator = 40;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numerator / numbers[i]);
        }
    }
}
