public class five {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4};  // Example array; change as needed
        int n = arr.length;
        
        // Edge cases
        if (n == 1) {
            System.out.println("Peak element is: " + arr[0]);
            return;
        }
        if (arr[0] >= arr[1]) {
            System.out.println("Peak element is: " + arr[0]);
            return;
        }
        if (arr[n-1] >= arr[n-2]) {
            System.out.println("Peak element is: " + arr[n-1]);
            return;
        }
        
        // Binary search for peak
        int low = 1;
        int high = n - 2;
        int peak = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] >= arr[mid - 1] && arr[mid] >= arr[mid + 1]) {
                peak = arr[mid];
                break;
            } else if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;  // Peak is in the right half
            } else {
                high = mid - 1;  // Peak is in the left half
            }
        }
        
        if (peak != -1) {
            System.out.println("Peak element is: " + peak);
        } else {
            System.out.println("No peak found (unexpected)");
        }
    }
}