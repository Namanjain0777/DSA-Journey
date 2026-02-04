public class three {
    public static void main(String[] args) {
        int [] arr = {0,1,2,0,3,4,5};
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while(left<right){
            if(arr[left]==0){
                for(int i = left ; i<n ; i++){
                    if(arr[i]!=0){
                        int temp = arr[left];
                        arr[left] = arr[i];
                        arr[i] = temp;
                        break;
                    }
                }
            }
            left++;
        }
        System.out.println(java.util.Arrays.toString(arr));
    }
}
