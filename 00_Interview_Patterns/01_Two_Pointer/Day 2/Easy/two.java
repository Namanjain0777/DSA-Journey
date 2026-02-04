
public class two {
    public static void main(String[] args) {
        String str = "HellH";

        str = str.toLowerCase();
        int left = 0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                System.out.println("Not a Palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println("Its a Palindrome");    
        
    }    
}
