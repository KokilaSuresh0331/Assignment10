package assignment10;

abstract class Shape {
    abstract double area();
    abstract double perimeter();
}

class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    double area() {
        return length * width;
    }
    
    @Override
    double perimeter() {
        return 2 * (length + width);
    }
}

class Square extends Shape {
    private double side;
    
    public Square(double side) {
        this.side = side;
    }
    
    @Override
    double area() {
        return side * side;
    }
    
    @Override
    double perimeter() {
        return 4 * side;
    }
}

class Circle extends Shape {
    private double radius;
    final double pi = Math.PI;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    double area() {
        return pi * radius * radius;
    }
    
    @Override
    double perimeter() {
        return 2 * pi * radius;
    }
}

public class ShapePolymorphism {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(5.5, 10);
        shapes[1] = new Square(5.6);
        shapes[2] = new Circle(20.0);
        
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.area());
            System.out.println("Perimeter: " + shape.perimeter());
            System.out.println();
        }
    }
}