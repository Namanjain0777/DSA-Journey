// Ceiling Definition: In a sorted array, 
// the ceiling of a number target is the smallest element that is greater than or equal to target.
// If target is larger than all elements, there's no ceiling.


public class three {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 11;  // Example target; change as needed
        
        int low = 0;
        int high = arr.length - 1;
        int ceiling = -1;  // Default: no ceiling found
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] == target) {
                ceiling = arr[mid];  // Exact match, so ceiling is the target
                break;
            } else if (arr[mid] < target) {
                low = mid + 1;  // Search right
            } else {
                ceiling = arr[mid];  // Potential ceiling, search left
                high = mid - 1;
            }
        }
        
        if (ceiling != -1) {
            System.out.println("Ceiling of " + target + " is: " + ceiling);
        } else {
            System.out.println("No ceiling found (target is larger than all elements)");
        }
    }
}

