package presentation2;

public class BasicStuff {

    static int z = 7;

    public static void main(String[] args) {

        // initialisation
        int a = 5;
        int b = (a = 4) * a;
        System.out.println(b);

        // switch
        for (int i = 1; i <= 6; i++) {
            funSwitch(i);
        }

        // exceptions
        // catch the exceptions from general to specific ones
        // finally is always executed
        int x = 0;
        try {
            if (Double.isInfinite(2 / x))
                System.out.println("infinite");
            else
                System.out.println("2 / 0");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (Exception e) {
            System.out.println("Something bad happened");
        } finally {
            System.out.println("Hello from finally block! :)");
        }

        // data types
        // 3 must be explicit converted to a short
        System.out.println(dataTypes((short) 3));


        // try the next line of code without the explicit conversion
        // try the next line with the operator >>>
        // try the next line without -
        byte y = (byte) -7 >> 1;
        System.out.println(y);

        // global initialisation vs. local
        System.out.print("z = " + z);
        int z = (z = 3) * z;
        System.out.print(" , z = " + z);

        // break
        System.out.println(sum(1));

    }

    static void funSwitch(int k) {
        switch (k) {
            default:
                System.out.println("default");
                //try to comment the next line of code and run again the code
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
            case 3:
                System.out.println("two or three");
                break;
            case 4:
            case 5:
                System.out.println("four or five");
        }
    }

    static int dataTypes(short a) {
        return a * 2;
    }

    static int sum(int i) {
        int sum = 0;
        // for (; ; ) is the same thing with while(true)
        for (; ; ) {
            sum += i++;
            if (i > 5) break;
        }
        return sum;
    }
}
