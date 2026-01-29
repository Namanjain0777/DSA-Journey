public class Pattern {
    public static void pattern1(int n) {
        // *****
        // *****
        // *****
        // *****
        // *****
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        // *
        // **
        // ***
        // ****
        // *****
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n){
        // *****
        // ****
        // ***
        // **
        // *
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n){
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5
        for(int i = 1 ; i<=n;i++){
            for(int j=1 ; j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void pattern5(int n){
        // *
        // **
        // ***
        // ****
        // *****
        // ****
        // ***
        // **
        // *
        for(int i = 1 ; i<=n;i++){
            for(int j=1 ; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n-1 ; i>=1;i--){
            for(int j=1 ; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Pattern 1:");
        pattern1(n);
        System.out.println("Pattern 2:");
        pattern2(n);
        System.out.println("Pattern 3:");
        pattern3(n);
        System.out.println("Pattern 4:");
        pattern4(n);
        System.out.println("Pattern 5:");
        pattern5(n);
    }
}