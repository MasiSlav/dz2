package ru.dataart.academy.java;

import ru.dataart.academy.java.figures.Calculator;

public class Main {
    public static void main(String[] args) {
        double[] arrCircle = {1, 2, 3, 4};
        double[] arrRectangle = {1, 2, 3, 4, 5, 6, 7, 8};
        Calculator Alculator = new Calculator(arrCircle, arrRectangle);
        System.out.print("SumRectangleArea=" + Alculator.sumAreaRectangle() + "\n" + "SumCircleArea=" + Alculator.sumAreaCircle());
    }
}