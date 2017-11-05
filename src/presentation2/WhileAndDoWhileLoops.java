package presentation2;

public class WhileAndDoWhileLoops {

    public static void main(String[] args) {

        /* Exercise 1 */
        // increase the number while its value is less than 11
        System.out.println("Exercise 1");
        int nr1 = 0;
        while (nr1 < 11) {
            System.out.print(nr1 + ", ");
            nr1 += 1;
        }

        System.out.println("");

        /* Exercise 2 */
        // prints a table of the powers of 2 that are less than or equal to 2^n.
        System.out.println("Exercise 2");
        int n = 6;
        int i = 0;                // count from 0 to N
        int powerOfTwo = 1;       // the ith power of two

        // repeat until i equals n
        while (i <= n) {
            System.out.println(i + " " + powerOfTwo);   // print out the power of two
            powerOfTwo = 2 * powerOfTwo;                // double to get the next one
            i = i + 1;
        }

        System.out.println("");

        /* Exercise 3 */
        // decrease the number while its value is bigger than or equal to 21
        System.out.println("Exercise 3");
        int nr2 = 32;
        do {
            System.out.print(nr2 + ", ");
            nr2 -= 1;
        } while (nr2 >= 21);
    }
}
