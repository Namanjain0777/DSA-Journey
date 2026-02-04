// Floor Definition: In a sorted array, 
// the floor of a number target is the largest element that is less than or equal to target. 
// If target is smaller than all elements, there's no floor.

public class two {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 15;
        int low = 0;
        int high = arr.length - 1;
        int floorIndex = -1;
        while(low<=high){
            int mid = low+(high - low)/2;
            if(arr[mid]==target){
                floorIndex = arr[mid];
                break;
            }else if(arr[mid]<target){
                floorIndex = arr[mid];  // Potential floor, search right
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
         if (floorIndex != -1) {
            System.out.println("Floor of " + target + " is: " + floorIndex);
        } else {
            System.out.println("No floor found (target is smaller than all elements)");
        }
    }   
}
