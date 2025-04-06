import java.util.Scanner;
import java.util.Arrays;

public class SearchElement {
    // Linear Search Method
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Found target at index i
            }
        }
        return -1; // Target not found
    }

    // Binary Search Method (Requires sorted array)
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                return mid; // Found target
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Sorted array
        System.out.print("Enter number of elements in sorted array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input: Target element
        System.out.print("Enter target element to search: ");
        int target = scanner.nextInt();

        // Linear Search
        int linearResult = linearSearch(arr, target);
        System.out.println(linearResult != -1 ? "Found at index (Linear Search): " + linearResult : "Not found (Linear Search)");

        // Binary Search
        int binaryResult = binarySearch(arr, target);
        System.out.println(binaryResult != -1 ? "Found at index (Binary Search): " + binaryResult : "Not found (Binary Search)");

        scanner.close();
    }
}
