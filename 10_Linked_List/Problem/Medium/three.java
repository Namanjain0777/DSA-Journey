import java.util.LinkedList;

public class three {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
  
        if(list.size()==0){
            System.out.println("Empty Link-list");
        }else if(list.size()==1){
            System.out.println("Middle Element " + list.getFirst());
        }else{
            int mid = list.size()/2;
            System.out.println("Middle Element : " + list.get(mid));
        }
    }    
}
