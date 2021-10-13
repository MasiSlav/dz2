package ru.dataart.academy.java.figures;

public class Rectangle extends Figure {
    double a, b;

    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double Area() {
        return a * b;
    }

    double Perimeter() {
        return 2 * (a + b);
    }
}
