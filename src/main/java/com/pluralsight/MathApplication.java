package com.pluralsight;

public class MathApplication {
    public static void main(String[] args) {
        double bobSalary = 2500;
        double garySalary = 4000;
        String text = "the highest salary is";
        double highestSalary = Math.max(bobSalary , garySalary);
        System.out.println(text + highestSalary);

        double carPrice =- 24000;
        double truckPrice = 54000;
        String mintext = "the smallest price";
        double minPrice = Math.min(carPrice,truckPrice);
    }
}
