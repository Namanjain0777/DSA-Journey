public class five {
    public static void main(String[] args) {
        int [] arr = {2,5,1,5,3,6,2,4,7,9,8,0};
        int target = 5;
        for(int i = arr.length -1 ; i>=0 ; i--){
            if(arr[i]==target){
                System.out.println( target + " Exists  ");
                break;
            }else if(i==0){
                System.out.println("Element not found");
            }
        }
    }
}
