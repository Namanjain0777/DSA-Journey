
public class three {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int left = 0;
        int right = arr.length-1;
        int target = 547;
        while(left<right){
            int mid = left + (right-left)/2;
            if(arr[mid] == target){
                System.out.println(target + " found at index : "+ mid);
                return;
            }else if(target<arr[mid]){
                right = mid +1;
            }else{
                left = mid+1;
            }
            if(left>=right){
                System.out.println("Not Found");
                break;
            }
        }
    }    
}
