package com.company;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Quad quad = new Quad();
        Rectangle rectangle = new Rectangle();
        Rhombus rhombus = new Rhombus();
        Trapezoid trapezoid = new Trapezoid();
        Triangle triangle = new Triangle();

        printShape(circle);
        printShape(quad);
        printShape(rectangle);
        printShape(rhombus);
        printShape(trapezoid);
        printShape(triangle);
    }

    public static void printShape(Shape shape){
        shape.print();
    }
}
