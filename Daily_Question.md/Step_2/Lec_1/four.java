import java.util.Arrays;

public class four {
    public static void main(String[] args) {
        int[] arr = {1, 3,5 , 3, 4, 5,1};  // Example array

        if (isSorted(arr)) {
            System.out.println("Array is already sorted.");
        } else {
            System.out.println("Array is not sorted.");
        }
        System.out.println(Arrays.toString(arr));
    }

    // Method to check if array is sorted using Bubble Sort optimization
    public static boolean isSorted(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Perform bubble sort but stop if no swaps occur
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no swaps happened, array is sorted
            if (!swapped) {
                return true;
            }
        }
        return false; // If swaps happened till the end, array was not sorted initially
    }
}