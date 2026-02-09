
public class one {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Helleh");
        
        if(sb.equals(sb.reverse())){
            System.out.println("Is palindrome");
        }else{
            System.out.println("Not an Palindrome");
        }
    }
}
