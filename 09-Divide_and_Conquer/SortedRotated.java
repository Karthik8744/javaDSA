public class SortedRotated {
    // Search an element in sorted, rotated array with distinct numbers (in ascending order).
    // It is rotated at a pivot element. Find the index of a given element.
    // ex: {4, 5, 6, 7, 0, 1, 2} target: 0
    static int search (int[] arr, int target, int si, int ei) {
        // Base Case
        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;    // (si + ei) / 2

        // Case found
        if (arr[mid] == target) {
            return mid;
        }

        // Two cases : 1. {3, 4, 5, 6, 0, 1, 2}   2. {5, 6, 0, 1, 2, 3, 4}
        // If left half is completely sorted
        if (arr[si] <= arr[mid]) {
            if (arr[si] <= target && target <= arr[mid]) {
                // Target is in left half
                return search(arr, target, si, mid-1);
            }
            else {
                // Target is in right half
                return search(arr, target, mid+1, ei);
            }
        }

        // If right half is completely sorted
        else {
            if (arr[mid] <= target && target <= arr[ei]) {
                // Target is in right half
                return search(arr, target, mid+1, ei);
            }
            else {
                // Target is in left half
                return search(arr, target, si, mid-1);
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int idx = search(arr, target, 0, arr.length-1);
        System.out.println(idx);
    }
}
