public class two {
    public static int reverse(int a){
        int temp = a;
        int rev = 0;
        while(temp>0){
            int lf = temp % 10;
            rev = (rev*10)+lf;
            temp = temp/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int a = 123456643;
        System.out.println(two.reverse(a));
    }
}
