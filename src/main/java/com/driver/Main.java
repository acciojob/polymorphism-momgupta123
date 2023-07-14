package com.driver;

public class Main {
    public static void main(String[] args) {
        // Task 2: Create an object of Product class called p
        Product p = new Product();

        // Task 3: Call the method product(int x, int y) using the Product class object p
        int result1 = p.product(5, 10);
        System.out.println("Result 1: " + result1);

        // Task 4: Call the overloaded method product(int x, int y, int z) using the Product class object p
        int result2 = p.product(2, 3, 4);
        System.out.println("Result 2: " + result2);

        // Task 5: Call the overloaded method product(double x, double y) using the Product class object p
        double result3 = p.product(2.5, 3.5);
        System.out.println("Result 3: " + result3);
    }

    public static class Product {
        // Task 3: Create the method product(int x, int y)
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: Create the overloaded method product(int x, int y, int z)
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: Create the overloaded method product(double x, double y)
        public double product(double x, double y) {
            return x * y;
        }
    }
}
