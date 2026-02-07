// Move all zeros to the end

import java.util.Arrays;

public class nine {
    public static void main(String[] args) {
        int [] arr = {1,2,0,3,0,4,0,0,6,0};
        int left = 0;
        int right = 0;
        while(right<arr.length){
            if(arr[right]!=0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
            right++;
        }
        System.out.println("Array after moving zeros to the end: "+ Arrays.toString(arr));
        
    }
}
