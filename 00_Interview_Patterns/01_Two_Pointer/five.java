import java.util.Arrays;

public class five {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,4};
        int n = arr.length;

        if (n == 0) {
            System.out.println(0);
            return;
        }

        int left = 0;

        for (int right = 1; right < n; right++) {
            if (arr[right] != arr[left]) {
                left++;
                arr[left] = arr[right]; 
            }
        }

        int uniqueLength = left + 1;
        System.out.println("Unique length: " + uniqueLength);
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(arr, uniqueLength)));
    }
}
