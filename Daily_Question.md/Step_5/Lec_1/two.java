public class two {
    public static void main(String[] args) {
        String str = "heh";
        String reversedStr = "";
        for(int i= str.length() - 1 ; i>= 0 ; i--){
            reversedStr = reversedStr + str.charAt(i);
        }
        if(str.equals(reversedStr)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
