public class two {
public static void printNto1(int n) {
        if(n>0){
            System.out.println(n);
            n--;
            printNto1(n);
        }
        if(n==0){
            return;
        }
    }

    public static void main(String[] args) {
        printNto1(15);
    }
}
