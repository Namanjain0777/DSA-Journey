public class eight {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;

        int left = 0;
        int right = arr.length - 1;
        int ceil = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                ceil = arr[mid];
                break;
            }
            else if (arr[mid] > target) {
                ceil = arr[mid];   // possible ceil
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        System.out.println("Ceil is: " + ceil);
    }
}
