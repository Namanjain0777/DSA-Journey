import java.util.Arrays;

public class three {
    public static void main(String[] args) {
        int [] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }

        System.out.println(left); // new length
    }
}
