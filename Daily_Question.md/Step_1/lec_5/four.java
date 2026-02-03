public class four {
    
    public static int printSum(int n){
        if(n==0){
            return 0;
        }
        return n%10 + printSum(n/10);

    }

    public static void main(String[] args) {
        System.out.println(printSum(5136));
    }
}
