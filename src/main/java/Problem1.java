public class Problem1 {

    /*
    Describe your algorithm here in up to 5 sentences:
    Sort by going through the array in the switch and determine if the index being looked at
    is a 0 or 1 or 2 with the multiple cases.
    mid will be the tracker that moves and as the mid is at the first function, 0
    it will use the switch algorithim to switch it with the low first number and then
    move both the low number and the mid up one.
    then if mid finds a 2 then it will swap the mid and the high number and then move the high
    down 1 since the far side of the array has a 2 now at the tail end.
    and the end is if the mid finds a 1 then it will just move forward as 1 is the middle.
     */

    // Do not change signature (function name, parameters type, and return type)

    // input: {2, 0, 2, 1, 1, 0},

    public static void colorSort(int[] nums) {
        int low = 0;
        int mid = 0;
        int temp = 0;
        int high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 2) {
                temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            } else {
                mid++;
            }
        }
    }
}