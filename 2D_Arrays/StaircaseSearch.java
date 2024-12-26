public class StaircaseSearch {
    // Time Complexity : O(m+n)  // If the element is at the opposite end it is the worst case
    // Only for sorted arrays
    static void search(int[][] arr, int key) {
        int row = 0;
        int col = arr[0].length-1;
        while (row < arr.length && col >= 0) {
            if (key == arr[row][col]) {
                System.out.println("The element is at index (" + row + ", " + col + ")");
                return;
            }
            else if (key < arr[row][col]) {
                col--;
            }
            else {
                row++;
            }
        }
    }


    public static void main(String[] args) {
        // Initializing 2D Array
        int[][] numbers = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };

        search(numbers, 37);
    }
}
