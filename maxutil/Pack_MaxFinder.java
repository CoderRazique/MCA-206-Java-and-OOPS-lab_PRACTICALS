// Write a Java package to determine maximum from given 100 numbers.

package maxutil;

public class Pack_MaxFinder {
    public int FindMax(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
