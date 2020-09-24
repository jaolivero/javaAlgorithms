public class SubArrayLargestSum {
    int ArrayMaxConsecutiveSum2(int[] inputArray) {
        int max_sum = inputArray[0];
        int current_sum = max_sum;
        for (int i = 1; i < inputArray.length; i++) {
            current_sum = Math.max(inputArray[i] + current_sum, inputArray[i]);
        }
        return max_sum;
    }
}
