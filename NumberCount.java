public class NumberCount {
    public static void main(String[] args) {
        String numbers = "12345";
        int countEven = 0;
        int countOdd = 0;
        int countPrime = 0;

        for (int i = 0; i < numbers.length(); i++) {
            char digit = numbers.charAt(i);
            int number = Character.getNumericValue(digit);

            if (isEven(number)) {
                countEven++;
            } else {
                countOdd++;
            }

            if (isPrime(number)) {
                countPrime++;
            }
        }

        System.out.println("Count of even numbers: " + countEven);
        System.out.println("Count of odd numbers: " + countOdd);
        System.out.println("Count of prime numbers: " + countPrime);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}

