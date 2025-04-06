public class PeakElement {
    public static int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] > nums[mid + 1]) {
                // Peak is in the left half
                right = mid;
            } else {
                // Peak is in the right half
                left = mid + 1;
            }
        }
        
        return left; // 'left' (or 'right') now points to a peak element index
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3,5, 1};
        int peakIndex = findPeakElement(arr);
        System.out.println("Peak element is at index: " + peakIndex + ", value: " + arr[peakIndex]);
    }
}
