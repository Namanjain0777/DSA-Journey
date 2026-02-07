import java.util.LinkedList;

public class two {
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
        list.addFirst(1000);
        System.out.println("Add element at beg: "+ list.toString());
        list.addLast(2000);
        System.out.println("Add element at Last: "+ list.toString());
        list.add(5, 1500);
        System.out.print(list);
    }    
}
