public class CheckPowerTwo {
    /*
     * Check wether the given function is power of 2 or not
     */
    static boolean isPowerOfTwo (int n) {
        return (n & n-1) == 0;
    }


    public static void main(String[] args) {
        if(isPowerOfTwo(16)) {
            System.out.println("The given number is power of 2.");
        }
        else {
            System.out.println("The given number is not power of 2.");
        }
    }    
}
