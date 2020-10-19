public class Problem2 {

    /*
    Describe your algorithm here in up to 5 sentences:
    Go through the array and checking if the value at first index
    is equal to the second value.
    if it is not equal then move on
    if it is equal then use a temp starting at the second value (and continue to increase)
    and rewrite that temp value with the first value + 1. so just writing second index on top of
    the second index.
     */

    // Do not change signature (function name, parameters and return type)
    // Do not use extra space for another array. Solution to be in-pace with O(1) extra memory

    //Input: {0, 0, 1, 1, 1, 2, 2, 4, 4, 6}

    public static int remove(int[] nums) {
        int n = nums.length;
        int temp = 1; // start temp infront of i
        for(int i = 0; i < n - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[temp++] = nums[i + 1];
            }
        }
        return temp;
    }
}

