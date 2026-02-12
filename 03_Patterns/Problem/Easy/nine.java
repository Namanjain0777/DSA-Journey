public class nine {
    public static void main(String[] args) {
        int n = 7;
        for(int i = 1 ; i<= n ; i++){
            int a = 0;
            for(int j = 1 ; j <= i ; j++){
                System.out.print(a + " ");
                a = a == 0 ? 1 : 0;
            }
            System.out.println();
        }
    }
}
