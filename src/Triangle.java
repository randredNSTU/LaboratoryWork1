import java.util.Scanner; // Импортируем класс Scanner из пакета java.util

public class Triangle { // Объявляем публичный класс Triangle
    private double sideA; // Объявляем приватную переменную sideA типа double
    private double sideB; // Объявляем приватную переменную sideB типа double
    private double sideC; // Объявляем приватную переменную sideC типа double

    // Конструктор класса Triangle, который принимает три аргумента типа double
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA; // Инициализируем поле sideA значением аргумента sideA
        this.sideB = sideB; // Инициализируем поле sideB значением аргумента sideB
        this.sideC = sideC; // Инициализируем поле sideC значением аргумента sideC
    }

    // Метод для вычисления периметра треугольника
    public double calculatePerimeter() {
        return sideA + sideB + sideC; // Возвращаем сумму всех сторон треугольника
    }

    // Метод для вычисления площади треугольника по формуле Герона
    public double calculateArea() {
        double semiPerimeter = calculatePerimeter() / 2; // Вычисляем полупериметр
        // Вычисляем площадь по формуле Герона и возвращаем ее
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
    }

    // Метод для проверки, является ли треугольник равнобедренным
    public boolean isIsosceles() {
        // Возвращаем true, если хотя бы две стороны равны, иначе false
        return sideA == sideB || sideB == sideC || sideC == sideA;
    }

    // Главный метод, точка входа в программу
    public static void main(String[] args) {
        // Создаем объект класса Scanner для чтения ввода пользователя
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя длину стороны A
        System.out.println("Введите длину стороны A:");
        double sideA = scanner.nextDouble(); // Читаем введенное пользователем значение и сохраняем в переменной sideA

        // Запрашиваем у пользователя длину стороны B
        System.out.println("Введите длину стороны B:");
        double sideB = scanner.nextDouble(); // Читаем введенное пользователем значение и сохраняем в переменной sideB

        // Запрашиваем у пользователя длину стороны C
        System.out.println("Введите длину стороны C:");
        double sideC = scanner.nextDouble(); // Читаем введенное пользователем значение и сохраняем в переменной sideC

        // Создаем объект класса Triangle с введенными пользователем сторонами
        Triangle triangle = new Triangle(sideA, sideB, sideC);
        // Выводим периметр треугольника
        System.out.println("Периметр треугольника: " + triangle.calculatePerimeter());
        // Выводим площадь треугольника
        System.out.println("Площадь треугольника: " + triangle.calculateArea());
        // Проверяем, является ли треугольник равнобедренным, и выводим результат
        System.out.println("Треугольник равнобедренный: " + triangle.isIsosceles());

        scanner.close();
    }
}
