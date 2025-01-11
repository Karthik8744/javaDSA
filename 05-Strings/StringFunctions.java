public class StringFunctions {
    public static void main(String[] args) {
        String str = "hello I am karthik";

        // Length of a string
        int len = str.length();    // length() is a function unlike a property in arrays

        // Iteration in a string
        for (int i = 0; i < len; i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();

        // Substring function
        String str2 = str.substring(0, 3);   // ending index is excluded
        System.out.println(str2);
    }
}
