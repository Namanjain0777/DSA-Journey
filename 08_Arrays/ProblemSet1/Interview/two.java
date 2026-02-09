
public class two {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,2};
        int n = arr.length;
        int min = arr[0];
        if(n == 0){
            System.out.println("Array is empty");
            return;
        }
        for(int i=1 ; i<n ; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }    
}
