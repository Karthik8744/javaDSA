public class Problems {
    // Print numbers in decreasing order
    static void decOrder (int n) {
        System.out.print(n + " ");
        if (n == 1) {
            System.out.println();
            return;
        }
        decOrder(n-1);
    }


    // Print numbers in inreasing order
    static void incOrder (int n) {
        if (n == 0) {
            return;
        }
        incOrder(n-1);
        System.out.print(n + " ");
    }


    // Print the factorial of a number
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    static int fact (int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n-1);
    }


    // Print sum of first n natural numbers
    // Time complexity: O(n)
    // Space Complexity: O(n)
    static int sum (int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n-1);
    }


    // Print nth fibonacci numbers
    // Time complexity: O(2^n)  very bad time complexity -> soluction: DP
    // Space Complexity: O(n)
    static int fibonacci (int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }


    // Check wether the given array is sorted or not
    static boolean isSorted (int[] arr, int i) {
        if (i == arr.length-1) {
            return true;
        }
        if (arr[i] <= arr[i+1]) {
            return isSorted(arr, i+1);
        }
        return false;
    }


    // Find first occurence of an element in an array
    static int firstOccurence (int[] arr, int k, int i) {
        if (i == arr.length) {
            return -1;
        }
        else if (arr[i] == k) {
            return i;
        }
        else {
            return firstOccurence(arr, k, i+1);
        }
    }


    // Find last occurence of an element in an array
    static int lastOccurence (int[] arr, int k, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, k, i+1);
        if (isFound == -1 && arr[i] == k) {
            return i;
        }
        return isFound;
    }
    

    public static void main(String[] args) {
        int n = 5;
        decOrder(n);
        incOrder(n);
        System.out.println();

        System.out.println("Factorial of number " + n + " is " + fact(n));

        System.out.println("Sum of first " + n + " natural numbers is " + sum(n));
        
        System.out.println(n + "th fibonacci numbers is " + fibonacci(n));

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        if (isSorted(arr1, 0)) {
            System.out.println("Array is sorted");
        }
        else {
            System.out.println("Array is not sorted");
        }

        int[] arr2 = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        int key = 5;
        int idx = firstOccurence (arr2, key, 0);
        if (idx == -1) {
            System.out.println(key + " is not found in the array");
        }
        else {
            System.out.println(key + " is found at index " + idx);
        }

        idx = lastOccurence (arr2, key, 0);
        if (idx == -1) {
            System.out.println(key + " is not found in the array");
        }
        else {
            System.out.println(key + " is found at index " + idx);
        }
    }
}
