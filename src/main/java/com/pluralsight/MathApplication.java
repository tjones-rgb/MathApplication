package com.pluralsight;

import java.sql.SQLOutput;

public class MathApplication {
    public static void main(String[] args) {
        // Question 1:
// declare variables here
// then code solution
// then use System.out.println() to display results
// ex: System.out.println("The answer is " + answer);
// REPEAT FOR NEXT EXERCISE
        double bobSalary = 2500;
        double garySalary = 4000;
        String text = "the highest salary is";
        double highestSalary = Math.max(bobSalary , garySalary);
        System.out.println(text + highestSalary);

        double carPrice = 24000;
        double truckPrice = 54000;
        String mintext = "the smallest price";
        double minPrice = Math.min(carPrice,truckPrice);
        System.out.println(minPrice);

        double radius = 7.25;
        //x² + y² = r²
        //7.25 * 7.25
        double area = Math.PI * radius * radius;
        System.out.println(area);

        double root = 5.0;
          double result =Math.sqrt(root);

        System.out.println(result);




    }
}
