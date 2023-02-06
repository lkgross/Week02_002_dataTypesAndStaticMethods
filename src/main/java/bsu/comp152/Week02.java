package bsu.comp152;

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
    }
}