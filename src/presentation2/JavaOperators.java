package presentation2;

public class JavaOperators {

    public static void main(String[] args) {

        int a = 2;
        int b = 4;
        int c = 2;

        /* Arithmetic Operators*/

        // addition
        int sum = a + b;
        System.out.println("Addition = " + c);

        // subtraction
        int subtraction = a - b;
        System.out.println("Subtraction = " + subtraction);

        // multiplication
        int multiplication = a * b;
        System.out.println("Multiplication = " + multiplication);

        // division
        int division = b / a;
        System.out.println("Division = " + division);

        // modulus
        int modulus = b % a;
        System.out.println("Modulus = " + modulus);



        /* Relational Operators*/

        // <=
        boolean isALessThanOrEqualToB = a <= b;
        System.out.println("Is a less than or equal to b = " + isALessThanOrEqualToB);

        // ==
        boolean isAEqualToC = a == c;
        System.out.println("a is equal to c = " + isAEqualToC);

        // !=
        boolean isADifferentThanB = a != b;
        System.out.println("a is not equal to b = " + isADifferentThanB);


        /* Unary Operators*/

        // ++
        int newA = ++a;
        System.out.println("newA = " + newA);

        // --
        int newB = --b;
        System.out.println("newB = " + newB);


        /* Logical Operators*/

        // &&
        boolean andOperator = isADifferentThanB && isAEqualToC;
        System.out.println("andOperator = " + andOperator);

        // ||
        boolean orOperator = isADifferentThanB || isAEqualToC;
        System.out.println("orOperator = " + orOperator);

        // |
        boolean notOperator = !isALessThanOrEqualToB;
        System.out.println("notOperator = " + notOperator);
    }
}

