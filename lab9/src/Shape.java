// Базовый класс
class Shape {
    // Метод для вычисления площади (по умолчанию 0)
    double area() {
        return 0;
    }

    // Метод main внутри Shape
    public static void main(String[] args) {
        // Создаем объекты
        Shape circle = new Circle(5);        // радиус 5
        Shape rectangle = new Rectangle(4, 6); // ширина 4, высота 6
        Shape triangle = new Triangle(3, 8);   // основание 3, высота 8

        // Выводим площадь каждой фигуры
        System.out.println("Circle area: " + circle.area());
        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Triangle area: " + triangle.area());
    }
}

// Производный класс Circle
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Производный класс Rectangle
class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}

// Производный класс Triangle
class Triangle extends Shape {
    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}