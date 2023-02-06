package bsu.comp152;

import java.util.Random;

public class Week02 {
    public static void main(String[] args) {
        System.out.println(12 + 12);
        System.out.println(12 - 12);
        System.out.println(12 * 12);
        // Watch out for integer divides!
        System.out.println(25 / 12);
        // We can avoid integer divides.
        System.out.println(25.0 / 12);
        System.out.println(25 / 12.);
        System.out.println(25. / 12.);
        System.out.println((double) 25 / (double) 12);
        // Be careful about order of operations.
        /*
         * Casting an integer as a double is a
         * widening type conversion.
         */
        System.out.println((double) (25 / 12));
        /*
         * Casting a double as an integer is a
         * narrowing type conversion.
         * Data can be lost when the decimal part is
         * dropped (truncated).
         */
        System.out.println((int) 2.0833);
        /* Calculate 25 % 12 ("25 mod 12" or
         * "25 modulus 12"): */
        System.out.println(25 % 12);
        // The mod operator gives the remainder.
        // In Java: and is &&:
        System.out.println(true && false);
        // In Java: or is ||:
        System.out.println(true || false);
        System.out.println(!true);
        // We can do concatenation with +:
        System.out.println("True or true is " + (true || false) +
                ".");
        System.out.println("3 + 5 is " + 3+5);
        // 3 was treated as a String.
        // 5 was treated as a String.
        System.out.println(3 + 5);
        System.out.println("3" + "5");
        // Change the order of operations using (...):
        System.out.println("3 + 5 is " + (3+5));
        System.out.println('3' + '5');
        System.out.println('a' + '\n');
        System.out.println("The character 3 is " + '3');
        /*
         * Java is a strongly typed language.
         * Variables in Java must be "declared."
         */
        int number1 = 25;
        // The above is called an inline initialization.
        /*
         * Inline initialization declares a type
         * and assigns a value on one line.
         * You can also declare a variable by type
         * and assign it a value in two steps.
         */
        int number2;
        number2 = 12;
        System.out.println(number1/number2);
        double number3, number4;
        number3 = 25.0;
        number4 = 12.0;
        System.out.println(number3 * number4);
        String name = "Laura";
        System.out.println("The professor's name is " + name);
        System.out.println(Math.sqrt(2));
        System.out.println(Math.sqrt(4));
        // Square root of negative numbers gives Not A Number.
        System.out.println(Math.sqrt(-12));
        boolean result = 2<2;
        System.out.println(result);
        System.out.println(result && true);
        Random rand = new Random();
        System.out.println(rand.nextInt(10));
        /* Printed out one of ten random integers
         * from 0 to 9 inclusive.
         *
         * On the Random object rand,
         * call the nextInt method,
         * passing in 10 as an argument.
         */
        // Note nextInt can also take two arguments.
        System.out.println(rand.nextInt(1, 7));
        // The above statement generates numbers 1 to 6 inclusive.
        dieRoll();
        /*
         * Call the static method multiSidedDieRoll
         * passing the argument (parameter value)
         * 6 or 12 or ... other number of sides.
         */
        multiSidedDieRoll(6);
        multiSidedDieRoll(12);
        System.out.println("You rolled a " + (returnRoll(6) + returnRoll(6)));
    }

    /**
     * Static method dieRoll -
     * Print the result of rolling a six-sided die.
     */
    public static void dieRoll() {
        Random rand = new Random();
        System.out.println("Your roll is " +
                (rand.nextInt(6) + 1));
    }

    /**
     * multiSidedDieRoll -
     * Print the result of rolling a die with sides
     * faces.
     * @param sides
     */
    public static void multiSidedDieRoll(int sides) {
        Random rand = new Random();
        System.out.println("Your roll is " +
                (rand.nextInt(sides) + 1));
    }

    /**
     * returnRoll -
     * Return the result of rolling a die with sides
     * faces.
     * @param sides
     * @return
     */
    public static int returnRoll(int sides) {
        Random rand = new Random();
        return rand.nextInt(sides) + 1;
    }
}