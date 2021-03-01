public class Exercise1 {

    public static void main(String[] args) {
        printNumbersOf1to100();
    }

    private static final String BUZZ = "Buzz";
    private static final String FIZZ = "Fizz";
    private static final String FIZZ_BUZZ = "FizzBuzz";

    public static void printNumbersOf1to100() {
        for (int numero = 1; numero <= 100; numero++) {
            if (isMultipleOfThree(numero) && isMultipleOfFive(numero)) {
                System.out.println(FIZZ_BUZZ);
            } else if (isMultipleOfThree(numero)) {
                System.out.println(FIZZ);
            } else if (isMultipleOfFive(numero)) {
                System.out.println(BUZZ);
            } else {
                System.out.println(numero);
            }
        }
    }

    private static boolean isMultipleOfThree(int numero) {
        return numero % 3 == 0;
    }

    private static boolean isMultipleOfFive(int numero) {
        return numero % 5 == 0;
    }
}
