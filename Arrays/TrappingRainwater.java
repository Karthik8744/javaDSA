class TrappingRainwater {
    /** Given non-negative integers representing an elevation map
    * where the width of each bar is 1,
    * Compute how much water it can trap after raining.
    */

    // Time complexity: O(n)
    static void rainWater(int arr[]) {
        int len = arr.length;
        int leftBound[] = new int[len];
        int rightBound[] = new int[len];

        leftBound[0] = 0;
        for(int i = 1; i < len; i++) {
            leftBound[i] = Math.max(leftBound[i-1], arr[i-1]);
        }

        rightBound[len-1] = 0;
        for(int i = len-2; i >= 0; i--) {
            rightBound[i] = Math.max(rightBound[i+1], arr[i+1]);
        }

        int total = 0;
        int height;
        int width = 1;
        for(int i = 0; i < len; i++) {
            height = Math.min(leftBound[i], rightBound[i]);
            if (height > arr[i]) {
                total += (height - arr[i]) * width;
            }
        }
        System.out.println("Total rainwater trapped is: " + total);
    }


    public static void main(String[] args) {
        int numbers[] = {4, 2, 0, 6, 3, 2, 5};
        rainWater(numbers);
    }
}