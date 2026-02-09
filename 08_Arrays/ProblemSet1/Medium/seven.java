public class seven {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;

        int left = 0;
        int right = arr.length - 1;
        int floor = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                floor = arr[mid];
                break;
            } 
            else if (arr[mid] < target) {
                floor = arr[mid];   // possible floor
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        System.out.println("Floor is: " + floor);
    }
}
