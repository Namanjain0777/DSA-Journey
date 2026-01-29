public class questionEasy {

    public static void printNo(int n) {
        if (n == 0) {   // ✅ base condition
            return;
        }

        printNo(n - 1);        // recursive call
        System.out.println(n); // work after call
    }

    public static void PrintReverse(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        PrintReverse(n-1);
    }

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    public static int countDigit(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + countDigit(n / 10);
    }
    
    public static int sumDigit(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumDigit(n / 10);
    }
    

    public static void main(String[] args) {
        printNo(5);
        PrintReverse(5);
        System.out.println(sum(5));
        System.out.println(countDigit(5678));
        System.out.println(sumDigit(1234));
    }
}
