public class thirteen {
    public static void main(String[] args) {

        int[][] arr = { 
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int target = 5;

        int row = 0;
        int col = arr[0].length - 1;

        while (row < arr.length && col >= 0) {

            if (arr[row][col] == target) {
                System.out.println("Found at (" + row + ", " + col + ")");
                return;
            }
            else if (arr[row][col] > target) {
                col--; // move left
            }
            else {
                row++; // move down
            }
        }

        System.out.println("Not Found");
    }
}
