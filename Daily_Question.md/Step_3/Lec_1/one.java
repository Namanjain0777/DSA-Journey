public class one {
    public static void main(String[] args) {
        int [] arr = {1,1,1};
        int min = arr[0];
        int max = arr[0];

        for(int i=0;i<arr.length; i++){
            if(arr.length == 0){
                System.out.println("Array is empty");
                return;
            }
            if(arr.length == 1){
                System.out.println("Min: " + arr[0]);
                System.out.println("Max: " + arr[0]);
                return;
            }
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Min: " + min);       
        System.out.println("Max: " + max);
    }
}
