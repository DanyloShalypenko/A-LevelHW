package ua.module2;

import java.util.List;

public class ProductProcessor {
    public static void main(String[] args) {
        String inputPath = "D:\\Java A-level\\A-level Hw\\src\\ua\\module2\\input.txt";
        String outputPath = "D:\\Java A-level\\A-level Hw\\src\\ua\\module2\\output.txt";

        // Чтение данных из файла
        List<Product> products = ProductUtils.readProductsFromFile(inputPath);

        // Сохранить изначальную таблицу в файл
        ProductUtils.writeProductsToFile(outputPath, "Initial Products:", products);

        // Отфильтровать и сохранить продукты с количеством больше заданного значения
        int filterQuantity = 3;
        List<Product> filteredProducts = ProductUtils.filterProducts(products, filterQuantity);
        ProductUtils.writeProductsToFile(outputPath, "Filtered Products: ", filteredProducts);


        // Отсортировать и сохранить все продукты по цене в порядке убывания
        ProductUtils.sortProductsByPriceDescending(products);
        ProductUtils.writeProductsToFile(outputPath, "Sorted Products by Price :", products);


        // Подсчитать и добавить общее количество, среднюю цену и общую стоимость в файл
        int totalQuantity = ProductUtils.calculateTotalQuantity(products);
        double totalCost = ProductUtils.calculateTotalCost(products);
        double averagePrice = ProductUtils.calculateAveragePrice(products, totalQuantity);

        ProductUtils.appendToOutputFile(outputPath, "Total Quantity: " + totalQuantity);
        ProductUtils.appendToOutputFile(outputPath, "Average Price: " + averagePrice);
        ProductUtils.appendToOutputFile(outputPath, "Total Cost: " + totalCost);
    }
}