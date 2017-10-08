public class ForLoop {

    public static void main(String[] args) {

        /* Exercise 1 */
        // compute a finite sum (1 + 2 + 3 + 4 + ... + n)
        System.out.println("Exercise 1");
        int n = 20;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum = " + sum);

        // second option: the ex. could be done by using the math formula
        int sumSecond = ((1 + n) * n) / 2;
        System.out.println("sumSecond = " + sumSecond);

        System.out.println("");

        /* Exercise 2 */
        // program to print fibonacci series using for loop
        System.out.println("Exercise 2");
        int count = 7, num1 = 0, num2 = 1;
        System.out.print("Fibonacci Series of " + count + " numbers: ");

        for (int i = 1; i <= count; ++i) {
            System.out.print(num1 + " ");

            /* On each iteration, we are assigning second number
             * to the first number and assigning the sum of last two
             * numbers to the second number
             */
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
    }
}
