class BubbleSort {
    // Bubble Sorting
    // Time Complexity: O(n²)
    static void bubble (int[] arr) {
        int len = arr.length;
        int temp;
        for (int i = 0; i < len - 1; i++) { 
            for (int j = 0; j < len-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                }
            }
        }
    }


    public static void main(String[] args) {
        int numbers[] = {5, 4, 1, 3, 2};
        bubble (numbers);
        for (int i: numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}