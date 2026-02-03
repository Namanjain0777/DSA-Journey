// An anagram check means both arrays should contain the same elements with the
// same frequency, regardless of order.

import java.util.Arrays;

public class three {
    public static void main(String[] args) {
        String[] str1 = { "apple", "banana", "apple", "orange", "banana", "apple" };
        String[] str2 = {"apple","apple","orange","orange","apple","banana"}; 
        // Step 1: Sort both arrays
        Arrays.sort(str1);
        Arrays.sort(str2);

        // Step 2: Compare arrays
        if (Arrays.equals(str1, str2)) {
            System.out.println("The arrays are anagrams");
        } else {
            System.out.println("The arrays are not anagrams");
        }

    }
}
