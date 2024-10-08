class pairsInArray {
    // Prints all the possible pairs in an array
    // Time complexity: O(n²)
    static void pairsInArray(int arr[]) {
        int len = arr.length;
        int curr;
        int tp = 0;
        for (int i = 0; i < len; i++) {
            curr = arr[i];
            for (int j = i + 1; j < len; j++) {
                System.out.print("(" + curr + "," + arr[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total no.of paris are: " + tp);
    }

    // Print all the subarrays in a array
    static void printSubArrays(int arr[]) {
        int len = arr.length;
        int ts = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total no.of subarray are: " + ts);
    }

    // Print all the subarrays in a array
    static void bruteSumArray(int arr[]) {
        int len = arr.length;
        int max = 0;
        int curr = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                for (int k = i; k <= j; k++) {
                    curr += arr[k];
                }
                max = Math.max(max, curr);
                curr = 0;
            }
        }
        System.out.println("Maximum sum of the subarrays is: " + max);
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        pairsInArray(numbers);

        printSubArrays(numbers);

        bruteSumArray(numbers);
    }
}