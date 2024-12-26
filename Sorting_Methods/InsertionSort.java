public class InsertionSort {
    // Selection Sorting
    // Time Complexity: O(n²)
    static void insertion (int[] arr) {
        int len = arr.length;
        int curr,prev;
        for (int i = 1; i < len; i++) {
            curr = arr[i];
            prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }


    public static void main(String[] args) {
        int numbers[] = {2, 4, 5, 3, 1};
        insertion (numbers);
        for (int i: numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}