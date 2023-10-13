package cw;

public class cw4 {
    public static void main(String[] args) {
        double[] prices = {200, 900, 500, 800, 1100, 600, 750, 300, 950, 50, 1400, 850};
        double totalCost = calculateTotalCost(prices, 1000);

        System.out.println("Общая стоимость товаров дороже 1000 UAH: " + totalCost + " UAH");
    }

    public static double calculateTotalCost(double[] prices, double threshold) {
        double totalCost = 0;

        for (double price : prices) {
            if (price > threshold) {
                totalCost += price;
            }
        }

        return totalCost;
    }
}

