public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculateDiagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Периметр прямоугольника: " + rectangle.calculatePerimeter());
        System.out.println("Площадь прямоугольника: " + rectangle.calculateArea());
        System.out.println("Длина диагонали прямоугольника: " + rectangle.calculateDiagonal());
    }
}