import java.util.Arrays;

public class two {
    public static void main(String[] args) {
        int [] arr = {5,1,2,3,4};
        for(int i = 0 ; i< arr.length-1 ; i++){
            int ptr = arr[i];
            for(int j = i+1; j < arr.length ; j++){
                if(ptr > arr[j]){
                    int temp = arr[j];
                    arr[j] = ptr;
                    arr[i] = temp;
                    ptr = arr[i];
                }
            }
            System.out.println("Pass " + Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }    
}
