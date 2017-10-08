public class IfCondition {

    public static void main(String[] args) {

        int a = 7;
        int b = -4;

        /* Exercise 1 */
        // if a number a is positive then display it
        // if not display the message "The number is negative"
        System.out.println("Exercise 1");
        if (a > 0) {
            System.out.println(a);
        } else {
            System.out.println("The number is negative");
        }

        System.out.println("");

         /* Exercise 2 */
        // if a number b is in the interval [5, 20)] then display "The number is in interval"
        // if not display "The number is not in the interval"
        System.out.println("Exercise 2");
        if (b >= 5 && b < 20) {
            System.out.println("The number is in interval");
        } else {
            System.out.println("The number is not in the interval");
        }
    }
}
