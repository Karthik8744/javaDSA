class CountingSort {
    // Counting Sorting
    // Only used for less range numbers
    // Time Complexity: O(n log n)
    // For positive numbers
    static void counting (int[] arr) {
        // Creating the count array
        int largest = Integer.MIN_VALUE;
        for (int i: arr) {
            largest = Math.max(largest, i);
        }

        int count[] = new int[largest + 1];
        for (int i: arr) {
            count[i]++;
        }

        // Sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }


    public static void main(String[] args) {
        int numbers[] = {1, 4, 1, 3, 2, 4, 3, 7};
        counting (numbers);
        for (int i: numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}