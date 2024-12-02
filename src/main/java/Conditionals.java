public class Conditionals {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        // This will cause an ArithmeticException


         num2 = 2; //Fix the Error
        if(num2 != 0){
            int result = num1 / num2;
            System.out.println("The division of " + num1 + " and " + num2 + " is: " +result);

        } else {
            System.out.println("Cannot be divided by 0");
        }
//    2: Identifying and Fixing an Array Index Bug
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 0, 16, 17, 18, 19, 20};
        int numerator = 40;

//        for (int i = 0; i <= numbers.length; i++) {
//            System.out.println(numerator / numbers[i]);
//        }
        //Fix the error
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] != 0){
                System.out.println(numerator/numbers[i]);
            } else {
                System.out.println("Cannot divide " +i + " by zero.");
            }
        }
    }
    }

