
public class two {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        int n = arr.length;
        int target = 3;
        int left = 0 ; 
        int right = arr.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid]==target){
                System.out.println("Found at " + mid);
                break;
            }else if(arr[mid]>target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
    }    
}
