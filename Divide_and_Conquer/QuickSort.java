public class QuickSort {
    // Time complexity: O(nlog(n))       worst case: O(n)
    // Space complexity: O(n²)
    static void quickSort (int[] arr, int si, int ei) {
        
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
