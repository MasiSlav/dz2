package ru.dataart.academy.java.figures;

public class Calculator {
    double[] arrCircle;
    double[] arrRectangle;

    public Calculator(double[] arrCircle, double[] arrRectangle) {
        this.arrCircle = new double[arrCircle.length];
        this.arrCircle = arrCircle;
        this.arrRectangle = new double[arrRectangle.length];
        this.arrRectangle = arrRectangle;
    }

    public double sumAreaRectangle() {
        double sum = 0;
        for (int i = 0; i < arrRectangle.length; i += 2) {
            Rectangle F1 = new Rectangle(arrRectangle[i], arrRectangle[i + 1]);
            sum += F1.Area();
        }
        return sum;
    }

    public double sumAreaCircle() {
        double sum = 0;
        for (int i = 0; i < arrCircle.length; i++) {
            Circle F2 = new Circle(arrCircle[i]);
            sum += F2.Area();
        }
        return sum;
    }
};
