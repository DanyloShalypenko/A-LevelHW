package ua.shalypenko.hw14;

import java.io.*;
import java.util.*;


public class EmployeeOperations {

    public static void main(String[] args) {
        List<Map<String, Object>> employees = readData("D:\\Java A-level\\A-level Hw\\src\\ua\\shalypenko\\hw14\\input.txt");

        // Task 1: Print full name of any employee whose firstName starts with ‘A’.
        List<String> task1Result = task1(employees);
        System.out.println("Task 1 Result: " + task1Result);

        // Task 2: Sort employees based on firstName, for same firstName sort by salary.
        List<Map<String, Object>> task2Result = task2(employees);
        System.out.println("Task 2 Result: " + task2Result);

        // Task 3: Print list of all employees with min salary
        List<Map<String, Object>> task3Result = task3(employees);
        System.out.println("Task 3 Result: " + task3Result);

        // Task 4: Count total salary
        int task4Result = task4(employees);
        System.out.println("Task 4 Result: " + task4Result);

        // Task 5: Find the difference in salary between the youngest and the oldest employee
        int task5Result = task5(employees);
        System.out.println("Task 5 Result: " + task5Result);

        // Write results to output.txt
        writeData("D:\\Java A-level\\A-level Hw\\src\\ua\\shalypenko\\hw14\\output.txt", task1Result, task2Result, task3Result, task4Result, task5Result);
    }

    // Function to read data from file
    public static List<Map<String, Object>> readData(String filePath) {
        List<Map<String, Object>> employees = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNext()) {
                Map<String, Object> employee = new HashMap<>();
                while (scanner.hasNext()) {
                    String line = scanner.nextLine().trim();
                    if (line.isEmpty()) {
                        break; // Empty line indicates the end of an employee's data
                    }
                    String[] parts = line.split(" : ");
                    employee.put(parts[0], parseValue(parts[1]));
                }
                employees.add(employee);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return employees;
    }

    // Function to parse values into appropriate types
    private static Object parseValue(String value) {
        if (value.startsWith("\"") && value.endsWith("\"")) {
            return value.substring(1, value.length() - 1); // Remove quotes for strings
        } else {
            return Integer.parseInt(value);
        }
    }

    // Task 1: Print full name of any employee whose firstName starts with ‘A’.
    public static List<String> task1(List<Map<String, Object>> employees) {
        List<String> result = new ArrayList<>();
        for (Map<String, Object> employee : employees) {
            String firstName = (String) employee.get("name");
            if (firstName.startsWith("A")) {
                result.add(employee.get("name") + " " + employee.get("secondName"));
            }
        }
        return result;
    }

    // Task 2: Sort employees based on firstName, for same firstName sort by salary.
    public static List<Map<String, Object>> task2(List<Map<String, Object>> employees) {
        employees.sort(Comparator.comparing(e -> e.get("name").toString()));
        employees.sort(Comparator.comparing(e -> (int) e.get("salary")));
        return employees;
    }

    // Task 3: Print list of all employees with min salary
    public static List<Map<String, Object>> task3(List<Map<String, Object>> employees) {
        int minSalary = employees.stream().mapToInt(e -> (int) e.get("salary")).min().orElse(0);
        return employees.stream().filter(e -> (int) e.get("salary") == minSalary).toList();
    }

    // Task 4: Count total salary
    public static int task4(List<Map<String, Object>> employees) {
        return employees.stream().mapToInt(e -> (int) e.get("salary")).sum();
    }

    // Task 5: Find the difference in salary between the youngest and the oldest employee
    public static int task5(List<Map<String, Object>> employees) {
        int maxAge = employees.stream().mapToInt(e -> (int) e.get("age")).max().orElse(0);
        int minAge = employees.stream().mapToInt(e -> (int) e.get("age")).min().orElse(0);
        int maxSalary = employees.stream().filter(e -> (int) e.get("age") == maxAge).mapToInt(e -> (int) e.get("salary")).findFirst().orElse(0);
        int minSalary = employees.stream().filter(e -> (int) e.get("age") == minAge).mapToInt(e -> (int) e.get("salary")).findFirst().orElse(0);
        return maxSalary - minSalary;
    }

    // Function to write data to file
    public static void writeData(String filePath, List<String> task1Result, List<Map<String, Object>> task2Result,
                                 List<Map<String, Object>> task3Result, int task4Result, int task5Result) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            writer.println("Task 1 Result: " + task1Result);
            writer.println("Task 2 Result: " + task2Result);
            writer.println("Task 3 Result: " + task3Result);
            writer.println("Task 4 Result: " + task4Result);
            writer.println("Task 5 Result: " + task5Result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

