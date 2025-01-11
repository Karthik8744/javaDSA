public class DiagonalSum {
    // Only for square matrix
    // Time Complexity: O(n)
    static void diagonalSum (int[][] arr) {
        // Primary Diagonal
        int pd = 0;
        // Secondary Diagonal
        int sd = 0;

        for (int i = 0; i < arr.length; i++) {
            pd += arr[i][i];
            if (i != arr.length-i-1) {
                sd = arr[i][arr.length-i-1];
            }
        }

        System.out.println("Sum of both the diagonals is " + (pd + sd));
    }

    public static void main(String args[]) {
        // Initializing array
        int[][] numbers = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        diagonalSum(numbers);
    }
}