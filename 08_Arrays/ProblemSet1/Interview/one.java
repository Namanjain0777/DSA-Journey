// peak element in an array is an element that is greater than or equal to its neighbors.
// An array can have multiple peak elements
// You can return any one peak
// The array does NOT need to be sorted
// Peak element depends on neighbors, not global maximum
public class one {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 1};
        int n = arr.length;
        if (n == 0) {
            System.out.println("No Peak");
            return;
        }

        if (n == 1) {
            System.out.println(0);
            return;
        }

        // Check first element
        if (arr[0] >= arr[1]) {
            System.out.println(0);
            return;
        }

        // Check middle elements
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                System.out.println(i);
                return;
            }
        }

        // Check last element
        if (arr[n - 1] >= arr[n - 2]) {
            System.out.println(n - 1);
        }
    }    
}
