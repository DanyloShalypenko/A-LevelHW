package ua.module2;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class ProductUtils {

    public static List<Product> readProductsFromFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            return br.lines()
                    .map(line -> {
                        String[] parts = line.split("\\|");
                        return new Product(parts[0].trim(), Integer.parseInt(parts[1].trim()), Double.parseDouble(parts[2].trim()));
                    })
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    public static void writeProductsToFile(String fileName, String header, List<Product> products) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
            writer.println(header);
            products.forEach(writer::println);
            writer.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void appendToOutputFile(String fileName, String content) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
            writer.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> filterProducts(List<Product> products, int filterQuantity) {
        return products.stream()
                .filter(product -> product.getQuantity() > filterQuantity)
                .collect(Collectors.toList());
    }

    public static int calculateTotalQuantity(List<Product> products) {
        return products.stream().mapToInt(Product::getQuantity).sum();
    }

    public static double calculateAveragePrice(List<Product> products, int totalQuantity) {
        double totalCost = products.stream().mapToDouble(product -> product.getQuantity() * product.getPrice()).sum();
        return (double) Math.round((totalCost / totalQuantity) * 100) /100;
    }

    public static void sortProductsByPriceDescending(List<Product> products) {
        products.sort(Comparator.comparingDouble(Product::getPrice).reversed());
    }

    public static double calculateTotalCost(List<Product> products) {
        return products.stream()
                .mapToDouble(product -> product.getQuantity() * product.getPrice())
                .sum();
    }
}
