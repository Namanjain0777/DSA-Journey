public class one {

    public static int[] minMax(int[] a) {
        int min = a[0];
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 3, 0};

        int[] result = minMax(a);

        System.out.println("Min = " + result[0]);
        System.out.println("Max = " + result[1]);
    }
}
