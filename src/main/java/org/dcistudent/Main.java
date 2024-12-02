package org.dcistudent;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        System.out.println("--- Exercise 1 ---");

        Integer value1 = 2;
        Integer value2 = 3;

        if (value1 * value2 == 5) { // setting breakpoint
            System.out.println("value1 + value2 is not equal to 5");
        }

        if (value1 + value2 == 5) { // fixing the operation
            System.out.println("value1 + value2 is equal to 5");
        }

        System.out.println("Exercise 2.1 ---");
        Integer value3 = 10;
        Integer value4 = 0;
        // Integer result = value3 / value4; // setting breakpoint

        value4 = 2;
        if (value4 > 0) { // fixing the error
            Integer result = value3 / value4;
            System.out.println("value3 / value4 is equal to " + result);
        }

        System.out.println("Exercise 2.2 ---");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 0, 16, 17, 18, 19, 20};
        int numerator = 40;

        // for (int i = 0; i <= numbers.length; i++) {
        //    System.out.println(numerator / numbers[i]); // setting breakpoint
        // }
        numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}; // fixing the error
        Integer result = 0;
        for (int i = 0; i < numbers.length; i++) { // setting breakpoint & fixing the error
            try { // checking for an error
                result = numerator / numbers[i];
            } catch (ArithmeticException e) {
                break;
            }

            System.out.println(result);
        }
    }
}