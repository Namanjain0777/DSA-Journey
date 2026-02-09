
public class four {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9,10,1,2,3};
        int n = arr.length;

        int low = 0, high = n - 1;

        while (low <= high) {

            // already sorted
            if (arr[low] <= arr[high]) {
                System.out.println(low);
                return;
            }

            int mid = low + (high - low) / 2;
            int next = (mid + 1) % n;
            int prev = (mid - 1 + n) % n;

            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
                System.out.println(mid);
                return;
            }

            if (arr[mid] >= arr[low]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }    
}
