import java.util.LinkedList;

public class three {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println("Original List: "+ list.toString());
        list.removeFirst();
        System.out.println("remove element at beg: "+ list.toString());
        list.removeLast();
        System.out.println("remove  element at Last: "+ list.toString());
        list.remove(2);
        System.out.print(list);
    }    
}
