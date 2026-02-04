
public class one {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int k = 3;
        int sum = 0;
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

         // Step 2: slide the window
        for (int i = k; i < arr.length; i++) {
            windowSum = windowSum + arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        System.out.println(maxSum);
        
    }
}
