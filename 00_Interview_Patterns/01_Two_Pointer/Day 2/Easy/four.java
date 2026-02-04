import java.util.Arrays;

public class four {
    public static void main(String[] args) {
    int[] arr = {1,1,2,2,3,3,3,4,5};
        int left = 0;
       
        for (int right = 1; right < arr.length; right++) {
            if (arr[right] != arr[left]) {
                left++;
                arr[left] = arr[right];
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOf(arr, left + 1)));
    }    
}
