class FastExponentiation {

    /*
     * Calculate a power b
     */
    // Time complexity: O(log n)

    /*
     * Uses the concept of a^(b+c) = a^b * a^c
     * Ex: 3^5 = 3^(101)₂ = (3^(2²*1)) * (3^(2¹*0)) * (3^(2⁰*1))
     */
    static int fastExponentiation(int num, int pow) {
        int ans = 1;
        while (pow != 0) {
            if ((pow & 1) == 1) {
                ans = ans * num;
            }
            num = num * num;
            pow = pow >> 1;
        }
        return ans;
    }


    public static void main(String[] args) {
        System.out.println(fastExponentiation(5, 3));
    }
}