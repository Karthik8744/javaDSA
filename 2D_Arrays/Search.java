import java.util.*;

class Search {
    // Search operation in 2D-arrays
    static void linearSearch (int[][] arr, int key) {
        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == key) {
                    System.out.println("Key found at index: (" + i + ", " + j + ")");
                    return;
                }
            }
        }
        System.out.println("Key not found");
    }


    public static void main(String args[]) {
        int numbers[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        linearSearch(numbers, 3);
    }
}