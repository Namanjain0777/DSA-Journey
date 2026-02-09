public class three {

    public static void binarySearch(int[] arr, int left, int right, int target) {

        // base condition
        if (left > right) {
            System.out.println("Not Found");
            return;
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            System.out.println("Found at index " + mid);
            return;
        } 
        else if (arr[mid] > target) {
            binarySearch(arr, left, mid - 1, target);
        } 
        else {
            binarySearch(arr, mid + 1, right, target);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        binarySearch(arr, 0, arr.length - 1, 7);
    }
}
