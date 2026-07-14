import java.util.*;

class So {

    public int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {

            int sum = numbers[left] + numbers[right];

            if (sum > target) {
                right--;
            }
            else if (sum < target) {
                left++;
            }
            else {
                return new int[]{left + 1, right + 1}; // 1-based index
            }
        }

        return null;
    }

    // For local testing
    public static void main(String[] args) {
        So obj = new So();
        int[] numbers = {2, 11,7, 15};
        int target = 9;

        System.out.println(Arrays.toString(obj.twoSum(numbers, target)));
    }
}
