import java.util.LinkedList;

public class four {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(6);
        list.add(4);
        list.add(9);
        list.add(5);
        list.add(2);
        
        LinkedList<Integer> list2 = new LinkedList<>();
        for(int i = 0 ; i < list.size() ; i++){
            list2.addFirst(list.get(i));
        }
        System.out.println(list);
        System.out.println(list2);
    }    
}
