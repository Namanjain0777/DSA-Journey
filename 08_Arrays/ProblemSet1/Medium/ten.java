
public class ten {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        int target = 3;
        int left = 0;
        int right = arr.length-1;
        if(arr[left]<arr[right]){
            System.out.println("In If Block");
            while(left<=right){
                int mid = left + (right-left)/2;
                if(arr[mid]==target){
                    System.out.println("Fount At "+ mid);
                    break;
                }else if(arr[mid]>target){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }
        }else{
            System.out.println("In Else Block");
            while(left<=right){
                int mid = left + (right-left)/2;
                if(arr[mid]==target){
                    System.out.println("Fount At "+ mid);
                    break;
                }else if(arr[mid]>target){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
        }
    }    
}
