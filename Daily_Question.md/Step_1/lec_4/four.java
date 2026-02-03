public class four {
    public static Boolean isArmStrong(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int digit = n%10;
            sum += digit*digit*digit;
            n = n/10;
        }
        return original==sum;
    }
    
    public static void main(String[] args) {
        System.out.println(isArmStrong(546));
    }
}   
