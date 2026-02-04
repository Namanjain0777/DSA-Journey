import java.util.Arrays;  // For sorting

public class three {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 2, 2, 1, 4, 5, 6};
        int target = 4;
        // Sort the array first (binary search requires sorted array)
        Arrays.sort(arr);

        int first = findFirstOccurrence(arr, target);

        if (first == -1) {
            System.out.println("Count of occurrences of " + target + " is: 0");
            return;
        }

        int last = findLastOccurrence(arr, target);

        int count = last - first + 1;
        System.out.println("Count of occurrences of " + target + " is: " + count);
    }
    
    public static int findFirstOccurrence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid;
                high = mid - 1;  // Search left for first
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
    
    public static int findLastOccurrence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid;
                low = mid + 1;  // Search right for last
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
}