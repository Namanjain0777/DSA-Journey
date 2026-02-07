import java.util.LinkedList;

public class nine {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,7};
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = arr.length-1 ; i>=0 ; i--){
            list.push(arr[i]);
        }
        System.out.println(list);
    }    
}
