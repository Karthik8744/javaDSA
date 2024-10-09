class SelectionSort {
    // Selection Sorting
    // Time Complexity: O(n²)
    static void selection (int[] arr) {
        int len = arr.length;
        int minIndex;
        int temp;
        for (int i = 0; i < len - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < len; j++) {
                minIndex = arr[minIndex] > arr[j] ? j : minIndex;
            }
            if (i != minIndex) {
                temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }


    public static void main(String[] args) {
        int numbers[] = {2, 4, 5, 3, 1};
        selection (numbers);
        for (int i: numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}