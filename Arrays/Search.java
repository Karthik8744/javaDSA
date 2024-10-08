import java.util.*;

class Operations {
    // Linear Search
    // Time complexity: O(n)
    static int linearSearch (int[] arr, int key) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // Largest Number in given array
    static void getLargest (int[] arr) {
        int len = arr.length;
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; 
        for (int i = 0; i < len; i++) {
            largest = Math.max(largest, arr[i]);
            smallest = Math.min(smallest, arr[i]);
        }
        System.out.println("Largest value is " + largest);
        System.out.println("Smallest value is " + smallest);
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int index = linearSearch(numbers, 10);
        if (index == -1) {
            System.out.println("Key not found");
        }
        else {
            System.out.println("Key is at index " + index);
        }

        getLargest(marks);
    }
}