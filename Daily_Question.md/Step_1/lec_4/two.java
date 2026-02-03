public class two {
    public static int GCD(int a, int b){
        if(b==0) return a;
        return GCD(b, a%b);
    }
    
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println(GCD(a,b));
    }
}
