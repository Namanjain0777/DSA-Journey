
public class nine {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 5;

        int left = 0;
        int right = arr.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > target) {
                ans = arr[mid];     // possible answer
                right = mid - 1;    // try to find smaller one
            } else {
                left = mid + 1;
            }
        }

        System.out.println("Smallest element greater than target: " + ans);
    }
}
