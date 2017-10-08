public class SwitchStatement {
    public static void main(String[] args) {

        /* Exercise 1 */
        // get the name of the day
        System.out.println("Exercise 1");
        int day = 6;
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("invalid day");
                break;
        }

        System.out.println("");


        /* Exercise 2 */
        // create a simple calculator
        System.out.println("Exercise 2");
        char operator = '/';
        Double number1 = 12d, number2 = 6d, result;

        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.print(number1 + " + " + number2 + " = " + result);
                break;

            case '-':
                result = number1 - number2;
                System.out.print(number1 + " - " + number2 + " = " + result);
                break;

            case '*':
                result = number1 * number2;
                System.out.print(number1 + " * " + number2 + " = " + result);
                break;

            case '/':
                result = number1 / number2;
                System.out.print(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

    }
}
