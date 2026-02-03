public class three {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,1,5,6,3,1};
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = i+1 ; j<arr.length ; j++){
               if(arr[i] == arr[j]){
                   System.out.println("First duplicate element is: " + arr[i]);
                   return;
               }
            }
        }
        System.out.println("No duplicate elements found.");
    }
}
