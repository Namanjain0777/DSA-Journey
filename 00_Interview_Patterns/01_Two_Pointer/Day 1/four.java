// Given a sorted array and a target, return true if any two numbers sum to target.

public class four {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,10};
        int target = 16;
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            if(arr[left]+arr[right]==target){
                System.out.println("The sum of "+ arr[left] + " and "+ arr[right]+ " is "+ target);
                break;
            }else if(arr[left]<target){
                left++;
            }else{
                right--;
            }  
        }
    }
}
