import java.util.Arrays;

public class three {
    public static void main(String[] args) {
        int [] arr = {1,0,2,3,0,4,0,0,5,0,0};
        int left = 0;
        for(int right = 0 ; right < arr.length ; right++){
            if(arr[right]!=0){
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }    
}
