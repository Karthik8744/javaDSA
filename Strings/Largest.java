public class Largest {
    /*
     * Print the lexicographically largest string among the given list of strings
     */

    // Time complexity: O(x*N)       // N is no.of strings and x is length of the largest string
    static String largest (String[] arr) {
        String largest = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if (largest.compareTo(arr[i]) < 0){
                largest = arr[i];
            }
        }

        return largest;
    }


    public static void main(String[] args) {
        String[] arr = {"mango", "apple", "banana"};
        System.out.println("Largest String is: " + largest(arr));
        
    }    
}
