// Remove all even numbers from an ArrayList

import java.util.ArrayList;

public class twelve {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        for(int i = 0 ; i<list.size();i++){
            if(list.get(i)%2==0){
                list.remove(i);
            }
        }
        System.out.println("Elements in the ArrayList after removing even numbers: " + list);
    
    }
    
}
