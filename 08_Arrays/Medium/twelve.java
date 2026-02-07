
public class twelve {
    public static void main(String[] args) {
        int [] arr = {7,6,5,4,3,2,1};
        int left = 0 ;
        int right = arr.length-1;
        if(arr[left]<arr[right]){
            System.out.println("Arrays is ascending order");
        }else{
            System.out.println("Arrays is descending order");
        }
    }    
}
