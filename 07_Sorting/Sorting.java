import java.util.Arrays;

public class Sorting {

    /* ================= SELECTION SORT ================= */
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    /* ================= BUBBLE SORT ================= */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }

    /* ================= INSERTION SORT ================= */
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    /* ================= CYCLE SORT ================= */
    public static void cycleSort(int[] arr) {
        int n = arr.length;

        for (int cycleStart = 0; cycleStart < n - 1; cycleStart++) {
            int item = arr[cycleStart];
            int pos = cycleStart;

            for (int i = cycleStart + 1; i < n; i++) {
                if (arr[i] < item) pos++;
            }

            if (pos == cycleStart) continue;

            while (item == arr[pos]) pos++;

            int temp = item;
            item = arr[pos];
            arr[pos] = temp;

            while (pos != cycleStart) {
                pos = cycleStart;

                for (int i = cycleStart + 1; i < n; i++) {
                    if (arr[i] < item) pos++;
                }

                while (item == arr[pos]) pos++;

                temp = item;
                item = arr[pos];
                arr[pos] = temp;
            }
        }
    }

    /* ================= MERGE SORT ================= */
    public static void mergeSort(int[] arr, int l, int r) {
        if (l >= r) return;

        int mid = l + (r - l) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    private static void merge(int[] arr, int l, int m, int r) {
        int[] left = Arrays.copyOfRange(arr, l, m + 1);
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);

        int i = 0, j = 0, k = l;

        while (i < left.length && j < right.length) {
            arr[k++] = left[i] <= right[j] ? left[i++] : right[j++];
        }

        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }

    /* ================= QUICK SORT ================= */
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    /* ================= COUNTING SORT ================= */
    public static void countingSort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int[] count = new int[max + 1];

        for (int x : arr) count[x]++;

        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i]-- > 0) {
                arr[index++] = i;
            }
        }
    }

    /* ================= RADIX SORT ================= */
    public static void radixSort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();

        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSortByDigit(arr, exp);
        }
    }

    private static void countingSortByDigit(int[] arr, int exp) {
        int[] output = new int[arr.length];
        int[] count = new int[10];

        for (int x : arr) count[(x / exp) % 10]++;

        for (int i = 1; i < 10; i++) count[i] += count[i - 1];

        for (int i = arr.length - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[--count[digit]] = arr[i];
        }

        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    /* ================= MAIN ================= */
    public static void main(String[] args) {
        int[] base = {2, 6, 5, 7, 1, 2, 3, 6, 8};

        int[] a;

        a = base.clone();
        selectionSort(a);
        System.out.println("Selection: " + Arrays.toString(a));

        a = base.clone();
        bubbleSort(a);
        System.out.println("Bubble:    " + Arrays.toString(a));

        a = base.clone();
        insertionSort(a);
        System.out.println("Insertion: " + Arrays.toString(a));

        a = base.clone();
        cycleSort(a);
        System.out.println("Cycle:     " + Arrays.toString(a));

        a = base.clone();
        mergeSort(a, 0, a.length - 1);
        System.out.println("Merge:     " + Arrays.toString(a));

        a = base.clone();
        quickSort(a, 0, a.length - 1);
        System.out.println("Quick:     " + Arrays.toString(a));

        a = base.clone();
        countingSort(a);
        System.out.println("Counting:  " + Arrays.toString(a));

        a = base.clone();
        radixSort(a);
        System.out.println("Radix:     " + Arrays.toString(a));
    }
}