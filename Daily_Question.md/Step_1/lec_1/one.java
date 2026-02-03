//  Count the number of digits in a number
public class one {  
    public static void main(String[] args) {
        int a = 4652;
        // Method 1 : Using Log 
        System.out.println("No of Digit in " + a + " is "+ (int)(Math.log10(a) + 1));
        // Method 2 :Using Loop
        int count = 0;
        int temp = a;
        while(temp > 0){
            count++;
            temp /= 10;
        }
        System.out.println("No of Digit in " + a + " is " + count);
    }
}
