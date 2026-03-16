package POLYMORPHISM;

class Shape {
    void area() {
        System.out.println("Calculated Area is:");
    }
    public static void main(String[] args) {
        Shape s;
        s = new Circle();
        s.area();
        s = new Rectangle();
        s.area();
        s = new Triangle();
        s.area();
    }
}
class Circle extends Shape {
    void area() {
        double radius = 5;
        System.out.println("Circle Area = " + (3.14 * radius * radius));
    }
}
class Rectangle extends Shape {
    void area() {
        int length = 10, width = 4;
        System.out.println("Rectangle Area = " + (length * width));
    }
}
class Triangle extends Shape {
    void area() {
        int base = 6, height = 8;
        System.out.println("Triangle Area = " + (0.5 * base * height));
    }
}
