public class Spiral {
    /** Take 2D array as an input
     * Print the 2D array in sprial fasion
    */

    // Time complexity: O(m*n)
    static void spiral(int arr[][]) {
        int startrow = 0;
        int startcol = 0;
        int endrow = arr.length-1;
        int endcol = arr[0].length-1;

        while (startrow <= endrow && startcol <= endcol) {
            // Top row
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(arr[startrow][j] + " ");
            }
            startrow++;

            // Right col
            for (int i = startrow; i <= endrow; i++) {
                System.out.print(arr[i][endcol] + " ");
            }
            endcol--;

            // In case of rectangular matrices
            if (startrow > endrow || startcol > endcol) {
                return;
            }

            // Bottom row
            for (int j = endcol; j >= startcol; j--) {
                System.out.print(arr[endrow][j] + " ");
            }
            endrow--;

            // Left col
            for (int i = endrow; i >= startrow; i--) {
                System.out.print(arr[i][startcol] + " ");
            }
            startcol++;

        }
    }


    public static void main(String[] args) {
        // Initializing array
        int[][] numbers = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        // For equal number of columns in each row(i.e; Rectangular matrices)
        spiral(numbers);
    }
}