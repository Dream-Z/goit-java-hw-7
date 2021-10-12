package com.company;

public class Main {

  public static void main(String[] args) {
    Shape circle = new Circle();
    Shape quad = new Quad();
    Shape rectangle = new Rectangle();
    Shape rhombus = new Rhombus();
    Shape trapezoid = new Trapezoid();
    Shape triangle = new Triangle();

    printShape(circle);
    printShape(quad);
    printShape(rectangle);
    printShape(rhombus);
    printShape(trapezoid);
    printShape(triangle);
  }

  public static void printShape(Shape shape) {
    shape.print();
  }
}
