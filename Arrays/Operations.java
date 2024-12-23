import java.util.*;

class Operations {
    // Input/Update operation in arrays
    static void update (int[] arr) {
        int len = arr.length;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    // Output operation in arrays
    static void display (int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        // Operations in array
        // Create
        int marks[] = new int[5];
        Scanner sc = new Scanner(System.in);
        
        // Length of array
        int len = marks.length;
        System.out.println(len);

        update(marks);
        display(marks);

        sc.close();
    }
}