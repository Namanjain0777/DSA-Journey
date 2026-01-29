
import java.util.Arrays;

public class Two {
    public static int[] reverse(int[] a){
        for(int i = 0 ; i<a.length/2 ; i++){
            int temp = a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 3, 0};
        reverse(a);
        System.out.println(Arrays.toString(a));
    }
}
