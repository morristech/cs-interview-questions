package questions;

public final class ReverseNumber {
    // Time - O(LOG(N), Space - O(1)
    public static long reverseLong(long number) {
        long reverseNumber = 0;

        while (number != 0) {
            final long moveDigit = reverseNumber * 10;
            final long lastDigit = number % 10;

            reverseNumber = moveDigit + lastDigit;

            number /= 10;
        }

        return reverseNumber;
    }

    public static int reverseInt(int number) {
        long reverseNumber = 0;

        while (number != 0) {
            final long moveDigit = reverseNumber * 10;
            final int lastDigit = number % 10;

            reverseNumber = moveDigit + lastDigit;

            number /= 10;
        }

        if (reverseNumber >= Integer.MAX_VALUE || reverseNumber <= Integer.MIN_VALUE) {
            return 0;
        }

        return (int) reverseNumber;
    }
}