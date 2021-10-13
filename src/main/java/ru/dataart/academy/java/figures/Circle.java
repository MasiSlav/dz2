package ru.dataart.academy.java.figures;

public class Circle extends Figure {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double Area() {
        return radius * radius * pi;
    }

    double Perimeter() {
        return 2 * pi * radius;
    }


}
