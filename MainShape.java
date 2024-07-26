// Base class Shape
class Shape {
    void draw() {
        System.out.println("Drawing a Shape");
    }

    void erase() {
        System.out.println("Erasing a Shape");
    }
}

// Subclass Circle
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    void erase() {
        System.out.println("Erasing a Circle");
    }
}

// Subclass Triangle
class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Triangle");
    }

    @Override
    void erase() {
        System.out.println("Erasing a Triangle");
    }
}

// Subclass Square
class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Square");
    }

    @Override
    void erase() {
        System.out.println("Erasing a Square");
    }
}

// Main class to test polymorphism
public class MainShape {
    public static void main(String[] args) {
        // Creating objects of each subclass
        Shape circle = new Circle();
        Shape triangle = new Triangle();
        Shape square = new Square();

        // Calling the draw and erase methods using polymorphism
        circle.draw();
        circle.erase();

        triangle.draw();
        triangle.erase();

        square.draw();
        square.erase();
    }
}