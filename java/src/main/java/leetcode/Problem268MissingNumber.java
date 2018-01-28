package leetcode;

/**
 * https://leetcode.com/problems/missing-number/description
 */
public final class Problem268MissingNumber {
    public static int missingNumber(int[] nums) {
        int arraySum = 0;
        for (int num : nums) {
            arraySum += num;
        }

        return getSumNaturalNumbers(nums) - arraySum;
    }

    public static int getSumNaturalNumbers(int[] numbers) {
        final int length = numbers.length;
        return (length * (length + 1)) / 2;
    }
}