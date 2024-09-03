import java.util.Arrays;

public class SmallestProduct {
    public static int ProductSmallestPair(int sum, int[] arr) {
        // Check for edge cases
        if (arr == null || arr.length < 2) {
            return -1;
        }

        // Sort the array to find the two smallest elements
        Arrays.sort(arr);

        // The two smallest elements are arr[0] and arr[1] after sorting
        if (arr[0] + arr[1] <= sum) {
            return arr[0] * arr[1];
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(ProductSmallestPair(9, new int[]{5, 2, 4, 3, 9, 7, 1}));  // Output: 2
        System.out.println(ProductSmallestPair(4, new int[]{9, 8, 3, -7, 3, 9}));   // Output: -21
    }
}
