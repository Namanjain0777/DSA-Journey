public class Five {
    public static int sum(int[] a){
        int sum = 0;
        for(int i = 0 ; i< a.length ; i++){
            sum += a[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 1,5};
System.out.println(sum(arr));
    }
}
