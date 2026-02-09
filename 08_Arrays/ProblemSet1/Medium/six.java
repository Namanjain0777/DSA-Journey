
public class six {
    public static void main(String[] args) {
        int count = 0;
        int [] arr = {1, 2, 3, 4, 5,3};
        int target = 7;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]==target){
                count++;
            }    
        }
        if(count==0){
            System.out.println(target + " not found in the array");
        }else{
            System.out.println("Count of " + target + " is " + count);  
        }
    }    
}
