
public class five {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5,3};
        int target = 3;
        for(int i = arr.length-1 ; i>=0 ; i--){
            if(arr[i]==target){
                System.out.println("Found at " + i);
                break;
            }
        }
    }   
}
