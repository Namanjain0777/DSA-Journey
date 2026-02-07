import java.util.LinkedList;

public class eight {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        Integer[] arr = list.toArray(new Integer[0]);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
