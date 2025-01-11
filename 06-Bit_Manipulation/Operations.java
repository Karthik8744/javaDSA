public class Operations {
    /*
     * Check weather a number is odd or even
     */
    static void oddEven (int n) {
        int bitmask = 1;
        if ((n & bitmask) == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }


    /*
     * Returns the ith position bit from right side
     */
    static int getIthBit (int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        }
        else {
            return 1;
        }
    }


    /*
     * Sets ith bit to 1
     */
    static int setIthBit (int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }


    /*
     * Clear ith bit to 0
     */
    static int clearIthBit (int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }


    /*
     * Turns ith to bit to desired value
     */
    static int updateIthBit (int n, int i, int newBit) {
        if (newBit == 1) {
            return setIthBit(n, i);
        }
        else {
            return clearIthBit(n, i);
        }
    }


    /*
     * Clear last i bits
     */
    static int clearLastIBits (int n, int i) {
        int bitmask = (~0) << i;
        return n & bitmask;
    }


    /*
     * Clear bits from range i to j
     */
    static int clearRangeOfBits (int n, int i, int j) {
        int a = (~0) << (j+1);
        int b = ~((~0) << (i+1));    // Also can be written as (1 << i) - 1
        int bitmask = a | b;
        return n & bitmask;
    }


    public static void main(String[] args) {
        int a = 10;
        oddEven(a);

        // Get ith bit
        int temp = getIthBit(a, 3);
        System.out.println(temp);

        // Set ith bit to 1
        temp = setIthBit(a, 2);
        System.out.println(temp);

        // Clear ith bit to 0
        temp = clearIthBit(a, 3);
        System.out.println(temp);

        // Update ith bit to 0 or 1
        temp = updateIthBit(a, 4, 1);
        System.out.println(temp);

        // Clear last i bits
        temp = clearLastIBits(15, 2);
        System.out.println(temp);

        // Clear range of bits from i to j bits
        temp = clearRangeOfBits(10, 2, 4);
        System.out.println(temp);
    }
}
