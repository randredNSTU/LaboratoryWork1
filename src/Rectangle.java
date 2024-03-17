public class Rectangle {
    // Поле для хранения ширины прямоугольника
    private double width;
    // Поле для хранения высоты прямоугольника
    private double height;

    // Конструктор класса Rectangle, который принимает ширину и высоту прямоугольника
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Метод для вычисления периметра прямоугольника
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    // Метод для вычисления площади прямоугольника
    public double calculateArea() {
        return width * height;
    }

    // Метод для вычисления длины диагонали прямоугольника
    public double calculateDiagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }


    // Главный метод, точка входа в программу
    public static void main(String[] args) {
        // Создаем объект класса Rectangle с шириной 5 и высотой 10
        Rectangle rectangle = new Rectangle(5, 10);
        // Выводим периметр прямоугольника
        System.out.println("Периметр прямоугольника: " + rectangle.calculatePerimeter());
        // Выводим площадь прямоугольника
        System.out.println("Площадь прямоугольника: " + rectangle.calculateArea());
        // Выводим длину диагонали прямоугольника
        System.out.println("Длина диагонали прямоугольника: " + rectangle.calculateDiagonal());
    }
}