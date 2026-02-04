public class four {
    public static void main(String[] args) {
        int[] arr = {5,2,2,3,4};
        int n = arr.length;
        if (arr[0] <= arr[n-1]) {
            System.out.println("Minimum element is: " + arr[0]);
            return;
        }
        int low = 0;
        int high = n - 1;
        int min = Integer.MAX_VALUE;
        while(low<high){
            int mid = low+(high-low)/2;
            // Check if mid is the minimum (rotation point)
            if (mid < n - 1 && arr[mid] > arr[mid + 1]) {
                min = arr[mid + 1];
                break;
            }
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                min = arr[mid];
                break;
            }
            
            // Decide which half to search
            if (arr[mid] >= arr[low]) {
                // Left half is sorted, minimum is in right half
                low = mid + 1;
            } else {
                // Right half is sorted, minimum is in left half
                high = mid - 1;
            }
        }
        System.out.println("Minimum element is: " + min);
    }
}
