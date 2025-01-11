import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {
    // Time Complexity: O(n log n)
    public static void main(String[] args) {
        int numbers[] = {2, 4, 5, 3, 1};
        // Arrays.sort(arr, si, ei); // si = Starting index, ei = Ending index(non - inclusive)
        Arrays.sort(numbers);
        for (int i: numbers) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Collections work only on primitive datatypes
        // Arrays.sort(arr, si, ei, Collections.reverseOrder());
        Integer nums[] = {2, 4, 5, 3, 1};
        Arrays.sort(nums, Collections.reverseOrder());
        for (int i: nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}