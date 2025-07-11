public class CountSetBits {

    static int countSetBits (int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {    // Checks Least Significant Bit
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSetBits(15));
    }
}
