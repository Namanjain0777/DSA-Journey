
public class one {
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5};
        int target = 7;
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                System.out.println(java.util.Arrays.toString(new int[]{left + 1, right + 1}
            ));
                return;
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        System.out.println("No such pair found");
    }
}
