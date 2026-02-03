// Print numbers from 1 to N using recursion

public class one {
    public static void printN(int n){
        if(n>0){
            n--;
            printN(n);
            System.out.println(n+1);
        }
        if(n==0){
            return;
        }
    }
    
    public static void main(String[] args) {
        printN(5);
    }
}
