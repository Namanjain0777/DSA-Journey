public class three {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 3, 4, 5};
        int n = arr.length;
        int target = 3;
        int lastIndex = -1;  

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == target) {
                lastIndex = i;
                break;  // Stop at the first (last) match
            }
        }
        
        if (lastIndex != -1) {
            System.out.println("Last Index of " + target + ": " + lastIndex);
        } else {
            System.out.println(target + " not found in the array.");
        }
    }
}