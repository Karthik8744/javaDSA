class PairsInArray {
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


    // Print all the subarrays in a array(Brute force)
    // Time Complexity: O(n³)
    static void bruteSumArray(int arr[]) {
        int len = arr.length;
        int max = Integer.MIN_VALUE;
        int curr = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                curr = 0;
                for (int k = i; k <= j; k++) {
                    curr += arr[k];
                }
                max = Math.max(max, curr);
            }
        }
        System.out.println("Maximum sum of the subarrays is: " + max);
    }


    // Print all the subarrays in a array(prefix sum)
    // Time Complexity: O(n²)
    static void prefixSumArray(int arr[]) {
        int len = arr.length;
        int prefix[] = new int[len];
        int max = Integer.MIN_VALUE;
        int curr;

        prefix[0] = arr[0];
        // Calculate prefix array
        for (int i = 1; i < len; i++) {
            prefix[i] = arr[i] + prefix[i-1];
        }
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                curr = (i == 0)? prefix[j] : prefix[j] - prefix[i - 1];
                max = Math.max(max, curr);
            }
        }

        System.out.println("Maximum sum of the subarrays is: " + max);
    }


    // Print all the subarrays in a array(kadane sum)
    // Time Complexity: O(n²)
    static void kadaneSumArray(int arr[]) {
        int max = Integer.MIN_VALUE;
        int curr = 0;
        for (int i: arr) {
            curr += i;
            max = Math.max(max, curr);
            curr = (curr < 0) ? 0 : curr;
        }

        System.out.println("Maximum sum of the subarrays is: " + max);
    }


    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        pairsInArray(numbers);

        printSubArrays(numbers);

        int nums[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        bruteSumArray(nums);
        prefixSumArray(nums);
        kadaneSumArray(nums);
    }
}