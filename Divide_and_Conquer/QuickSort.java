public class QuickSort {
    // Time complexity: O(nlog(n))       worst case: O(n)
    // Worst case occurs when pivot element is always smallest element or largest element
    // Space complexity: O(n²)
    static void quickSort (int[] arr, int si, int ei) {
        if(si >= ei) {
            return;
        }
        // last element
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx-1);  // left
        quickSort(arr, pIdx+1, ei);  // right
    }


    static int partition (int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;  // to make place for elements smaller than pivot
        
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }


    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8, 7};
        quickSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}