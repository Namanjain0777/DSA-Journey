import java.util.Iterator;
import java.util.LinkedList;

public class seven {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        System.out.println("Original List: " + list);

        System.out.println("Using for loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("Using for-each loop:");
        for (Integer val : list) {
            System.out.println(val);
        }

        System.out.println("Using Iterator:");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
