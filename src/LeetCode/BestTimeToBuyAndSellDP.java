package LeetCode;

/**
 * Created by deepaksharma on 12/21/17.
 */
public class BestTimeToBuyAndSellDP {

    public static int maxProfitLinearSpace(int k, int[] prices) {
        if (k == 0 || prices.length == 0) {
            return 0;
        }

//        if (k >= prices.length) {
//            return allTimeProfit(prices);
//        }
        int[] T = new int[prices.length];
        int[] prev = new int[prices.length];
        for (int i = 1; i <= k; i++) {
            int maxDiff = -prices[0];
            for (int j = 1; j < prices.length; j++) {
                T[j] = Math.max(T[j - 1], maxDiff + prices[j]);
                maxDiff = Math.max(maxDiff, prev[j] - prices[j]);
            }
            for (int j = 1; j < prices.length; j++) {
                prev[j] = T[j];
            }
        }
        return T[T.length - 1];
    }

    public static void main(String[] args){
        int prices[] = {2, 5, 7, 1, 4, 3, 1, 3};
        maxProfitLinearSpace(3,prices);
    }
}
