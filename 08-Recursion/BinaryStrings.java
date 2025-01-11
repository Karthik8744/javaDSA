public class BinaryStrings {
    /*
     * Print all binary strings of size N without consecutive ones
     */
    static void binaryStrings (int n, String str, int lastplace) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        System.out.println(str);
        binaryStrings (n-1, str + "0", 0);
        if (lastplace == 0) {
            binaryStrings (n-1, str + "1", 1);
        }
        
    }

    public static void main(String[] args) {
        binaryStrings(3, new String(""), 0);
    }
}
