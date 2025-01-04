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


    // Find a^n
    // Time complexity: O(n)
    static int power (int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * power(a, n-1);
    }


    // Find a^n
    // Time complexity: O(logn)
    static int powerOp (int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfp = powerOp(a, n/2);
        if (n % 2 == 0) {
            return halfp * halfp;
        }
        return halfp * halfp * a;
    }
    

    // Tiling Problem
    /*
     * Given a '2 * n' board and tiles of size '2 * 1',
     * count the number of ways to tile the given board using the 2 * 1 tiles.
     * (A tile can either be placed horizontally or vertically)
     */
    static int tiles (int n) {
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // tiles(n-1) for vertical tiles(n-2) for horizontal
        return tiles(n-1) + tiles(n-2);
    }


    // Remove duplicates in a string
    // Strings with only integers
    static void removeDup (String str, int idx, StringBuilder newstr, boolean[] map) {
        if (idx == str.length()) {
            System.out.println(newstr.toString());
            return;
        }

        char temp = str.charAt(idx);
        if (!map[temp - 'a']) {
            newstr.append(temp);
            map[temp - 'a'] = true;
        }
        removeDup(str, idx+1, newstr, map);
    }
    

    // Pairing problem
    /*
     * Given n friends, each one can remain single or can be paired up with some other friend. 
     * Each friend can be paired only one.
     * Find out the toal no.of ways in which friends can remain single or can be paired up.
     */
    static int pairing (int n) {
        // Base case 
        if (n == 1 || n == 2) {
            return n;
        }

        // pairing(n-1) if person is single
        // (n-1) * pairing(n-2) if person is mingle
        return pairing(n-1) + ((n-1) * pairing(n-2));
    }


    public static void main(String[] args) {
        int n = 5;
        decOrder(n);
        incOrder(n);
        System.out.println();

        // Factorial of n
        System.out.println("Factorial of number " + n + " is " + fact(n));

        // Sum of N natural numbers
        System.out.println("Sum of first " + n + " natural numbers is " + sum(n));
        
        // Nth number in fibonacci series
        System.out.println(n + "th fibonacci numbers is " + fibonacci(n));


        // Check wether the array is sorted or not
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        if (isSorted(arr1, 0)) {
            System.out.println("Array is sorted");
        }
        else {
            System.out.println("Array is not sorted");
        }

        int[] arr2 = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        int key = 5;

        // First occurence of an element in an array
        int idx = firstOccurence (arr2, key, 0);
        if (idx == -1) {
            System.out.println(key + " is not found in the array");
        }
        else {
            System.out.println(key + " is found at index " + idx);
        }

        // Last occurence of an element in an array
        idx = lastOccurence (arr2, key, 0);
        if (idx == -1) {
            System.out.println(key + " is not found in the array");
        }
        else {
            System.out.println(key + " is found at index " + idx);
        }

        int k = 2;
        // a^n
        System.out.println("The power of " + k + " power " + n + " is " + power(k, n));

        // a^n optimised
        System.out.println("The power of " + k + " power " + n + " is " + powerOp(k, n));

        // Tailing Problem
        System.out.println("The total number of ways to place " + n + " tiles are " + tiles(n));

        // Remove Duplicates
        String str = "helloworld";
        removeDup (str, 0, new StringBuilder(""), new boolean[26]);

        // Pairing problem
        System.out.println(n + " people can form " + pairing(n) + " pairs.");
    }
}
