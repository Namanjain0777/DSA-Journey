public class two {
    public static void main(String[] args) {
        int [] arr = {2,5,1,5,3,6,2,4,7,9,8,0};
        int target = 2;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]==target){
                System.out.println("Element 1st Occurence of " + target + " at index: " + i);
                break;
            }else if(i==arr.length -1){
                System.out.println("Element not found");
            }
        }

    }
}
