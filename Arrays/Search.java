import java.util.*;

class Search {
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
    static int getLargest (int[] arr) {
        int len = arr.length;
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; 
        for (int i = 0; i < len; i++) {
            largest = Math.max(largest, arr[i]);
            smallest = Math.min(smallest, arr[i]);
        }
        System.out.println("Smallest value is " + smallest);
        return largest;
    }

    // Only for sorted array
    // Binary Search
    // Time complexity: O(log n)
    static int binarySearch (int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while(start <= end) {
            mid = (start + end) / 2;
            // Comparisions
            if (key == arr[mid]) {
                return mid;
            }
            if (key > arr[mid]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    //Reverse an array
    static void reverseArray (int[] arr) {
        int len = arr.length;
        int temp;
        for (int i = 0; i < len / 2; i++) {
            temp = arr[len-i-1];
            arr[len-i-1] = arr[i];
            arr[i] = temp;
        }
    }


    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16, 18};
        int index = linearSearch(numbers, 10);
        if (index == -1) {
            System.out.println("Key not found");
        }
        else {
            System.out.println("Key is at index " + index);
        }

        int largest = getLargest(numbers);
        System.out.println("Largest value is " + largest);

        index = binarySearch(numbers, 16);
        if (index == -1) {
            System.out.println("Key not found");
        }
        else {
            System.out.println("Key is at index " + index);
        }

        reverseArray(numbers);
        int len = numbers.length;
        for (int i = 0; i < len; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}