import java.util.*;

class Operations {
    // Input/Update operation in arrays
    static void update (int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    // Output operation in arrays
    static void display (int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        System.out.println("\n2D-array: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        // Operations in array
        // Create
        int marks[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        
        // no.of rows and columns
        int rows = marks.length;
        int cols = marks[0].length;
        System.out.println("rows: " + rows + ", cols: "  + cols);

        update(marks);
        display(marks);

        sc.close();
    }
}