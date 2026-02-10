import java.util.LinkedList;

public class two {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        int index = 3;
        for(int i = 0 ; i < list.size() ; i ++){
            if(i == index){
                list.remove(index);
            }
        }
        System.out.println(list);
    }
}
