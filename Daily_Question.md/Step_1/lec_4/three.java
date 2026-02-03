public class three {
    public static int GCD(int a, int b){
        if(b==0) return a;
        return GCD(b, a%b);
    }

    public static void main(String[] args) {
        int a = 15;
        int b = 25;
        System.out.println("LCM is: " + (a*b)/GCD(a,b));
    }
}
