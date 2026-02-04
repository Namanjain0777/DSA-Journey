// Check if an array reads the same forward and backward.

public class three {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 2, 1};
        int left = 0;
        int right = arr.length - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (arr[left] != arr[right]) {
                isPalindrome = false;
                break; // no need to check further
            }
            left++;
            right--;
        }

        System.out.println(isPalindrome);
    }
}
