class Stocks {
    //Best time to Buy and Sell Stocks
    /**You are given an array prices where prices[i] is the price of a given stock on the ith day.
     * You want to maximize your profit by choosing a single day to buy one stock
     * and choosing a different day in the future to sell that stock
     * Return the maximum profit you can achieve from this transaction.
     * If you cannot achieve any profit, return 0
     */

    // Time Complexity: O(n)
    static int sellStocks(int[] stocks) {
        int buyPrice = Integer.MAX_VALUE;
        int profit;
        int maxProfit = 0;
        for (int stock: stocks) {
            profit = stock - buyPrice;
            buyPrice = Math.min(buyPrice, stock);
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int numbers[] = {7, 1, 5, 3, 6, 4};
        System.out.println(sellStocks(numbers));
    }
}