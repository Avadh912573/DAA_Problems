public class FindMinimumInRotatedSortedArray {
    public static int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                // Minimum must be in the right half
                left = mid + 1;
            } else {
                // Minimum is in the left half (or at mid)
                right = mid;
            }
        }

        return nums[left]; // 'left' now points to the minimum element
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 8, 1, 2 };
        System.out.println("The minimum element is: " + findMin(arr));
    }
}