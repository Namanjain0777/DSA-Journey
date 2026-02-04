public class one {
    public static void main(String[] args) {
        String str = "hello world";
        String reversedStr = "";
        for(int i= 0 ; i< str.length() ; i++){
            reversedStr = str.charAt(i) + reversedStr;
        }
        System.out.println(reversedStr);
    }
}
