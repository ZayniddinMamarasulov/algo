public class FinalPrice1475 {

    public static void main(String[] args) {
//        finalPrices(new int[]{8, 4, 6, 2, 3});
        finalPrices(new int[]{10, 1, 1, 6});
    }

    public static int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] < prices[i]) {
                prices[i] -= prices[i + 1];
            } else {
                int minIndex = findMin(prices[i], i + 1, prices);
                if (minIndex != -1) prices[i] -= prices[minIndex];
            }
        }

        return prices;
    }

    public static int findMin(int price, int beginIndex, int[] prices) {
        for (int i = beginIndex; i < prices.length; i++)
            if (prices[i] <= price)
                return i;

        return -1;
    }
}
